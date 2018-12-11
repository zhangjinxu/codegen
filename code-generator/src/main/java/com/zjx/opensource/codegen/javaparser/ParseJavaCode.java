package com.zjx.opensource.codegen.javaparser;

import com.github.javaparser.JavaParser;
import com.github.javaparser.JavaParserBuild;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.DataKey;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.resolution.types.ResolvedType;
import org.mybatis.generator.config.MergeConstants;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ParseJavaCode {

    public static void main(String[] args) throws IOException {
        Resource resource =
                new FileSystemResource("/Users/zhangjinxu/IdeaProjects/codegen/code-template/src/main/java/com/zjx/opensource/codegen/model/CodegenTestModel.java");
        CompilationUnit unit = JavaParser.parse(resource.getInputStream());
        List<FieldDeclaration> fields = unit.findAll(FieldDeclaration.class);
        
        for (FieldDeclaration field : fields) {
            Comment comment = field.getComment().get();
            System.out.println(comment.toString().contains(MergeConstants.NEW_ELEMENT_TAG));
//            System.out.println(field);
        }
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
