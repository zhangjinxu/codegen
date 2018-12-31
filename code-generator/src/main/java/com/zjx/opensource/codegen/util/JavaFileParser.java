package com.zjx.opensource.codegen.util;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.sun.istack.internal.NotNull;
import org.mybatis.generator.config.MergeConstants;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaFileParser {

    public static List<String> getAllNotMarkContent(@NotNull File file) throws FileNotFoundException {
        CompilationUnit unit = JavaParser.parse(file);
        List<String> contents = new ArrayList<>();
        contents.addAll(getNotMarkField(unit));
        contents.addAll(getNotMarkMethod(unit));
        contents.addAll(getNotMarkClassOrInterface(unit));
        contents.addAll(getNotMarkEnum(unit));
        return contents;
    }

    public static List<String> getNotMarkMethod(@NotNull CompilationUnit unit) {
        return getNotMarkContentByType(unit, MethodDeclaration.class);
    }

    private static List<String> getNotMarkField(@NotNull CompilationUnit unit) {
        return getNotMarkContentByType(unit, FieldDeclaration.class);
    }

    private static List<String> getNotMarkClassOrInterface(@NotNull CompilationUnit unit) {
        return getNotMarkContentByType(unit, ClassOrInterfaceDeclaration.class);
    }

    private static List<String> getNotMarkEnum(@NotNull CompilationUnit unit) {
        return getNotMarkContentByType(unit, EnumDeclaration.class);
    }

    private static <T extends Node> List<String> getNotMarkContentByType(@NotNull CompilationUnit unit, @NotNull Class<T> nodeType) {
        List<T> all = unit.findAll(nodeType);
        List<String> allContents = new ArrayList<>();
        for (T t : all) {
            if (!t.toString().contains(MergeConstants.NEW_ELEMENT_TAG)) {
                allContents.add(t.toString());
            }
        }
        return allContents;
    }





    private static CompilationUnit getTestUnit() throws IOException {
        Resource resource =
                new FileSystemResource("/Users/zhangjinxu/IdeaProjects/codegen/code-template/src/main/java/com/zjx/opensource/codegen/mapper/CodegenTestModelMapper.java");
        return JavaParser.parse(resource.getInputStream());
    }

    public static void main(String[] args) throws IOException {
        CompilationUnit unit = getTestUnit();
        List<String> method = getNotMarkMethod(unit);
        System.out.println(method);

//        List<String> notMarkEnum = getNotMarkEnum(getTestUnit());
//        for (String s : notMarkEnum) {
//            System.out.println(s);
//        }
//        Resource resource =
//                new FileSystemResource("/Users/zhangjinxu/IdeaProjects/codegen/code-template/src/main/java/com/zjx/opensource/codegen/model/CodegenTestModel.java");
//        CompilationUnit unit = JavaParser.parse(resource.getInputStream());
//        List<FieldDeclaration> fields = unit.findAll(FieldDeclaration.class);
//
//        for (FieldDeclaration field : fields) {
//            Comment comment = field.getComment().get();
//            System.out.println(comment.toString().contains(MergeConstants.NEW_ELEMENT_TAG));
//            System.out.println(field);
//        }
//        List<MethodDeclaration> methods = unit.findAll(MethodDeclaration.class);
//        for (MethodDeclaration method : methods) {
//            System.out.println(method);
//        }
//        List<ClassOrInterfaceDeclaration> classes = unit.findAll(ClassOrInterfaceDeclaration.class);
//        for (ClassOrInterfaceDeclaration c : classes) {
//            System.out.println(c);
//        }
//        List<EnumDeclaration> enums = unit.findAll(EnumDeclaration.class);
//        for (EnumDeclaration e : enums) {
//            System.out.println(e);
//        }

    }
}
