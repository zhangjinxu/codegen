package com.zjx.opensource.codegen.mbg.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.config.MergeConstants;

import java.util.List;

public class CodegenModelToExamplePlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
        generateModelToExampleMethod(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
        generateModelToExampleMethod(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean modelRecordWithBLOBsClassGenerated(
            TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        generateModelToExampleMethod(topLevelClass, introspectedTable);
        return true;
    }

    private boolean generateModelToExampleMethod(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {

        Method method = new Method();
        method.setName("toExample");
        method.setConstructor(false);
        method.setVisibility(JavaVisibility.PUBLIC);

        FullyQualifiedJavaType topLevelClassType = topLevelClass.getType();
        FullyQualifiedJavaType modelExample = new FullyQualifiedJavaType(topLevelClassType.getFullyQualifiedName()+"Example");
        method.setReturnType(modelExample);

        addBodyLine(method,topLevelClass);
        addJavaDocLine(method,topLevelClass);

        topLevelClass.addMethod(method);
        return true;
    }
    private void addBodyLine(Method method, TopLevelClass topLevelClass) {
        List<String> bodyLines = method.getBodyLines();
        bodyLines.add("int i = 0;");
        bodyLines.add("return null;");

        List<Field> fields = topLevelClass.getFields();
    }
    private void addJavaDocLine(Method method, TopLevelClass topLevelClass) {
        List<String> javaDocLines = method.getJavaDocLines();
        javaDocLines.add("/** ");
        javaDocLines.add("* " + "将model类中的非null字段转化为Example中的条件");
        javaDocLines.add("* " + MergeConstants.NEW_ELEMENT_TAG);
        javaDocLines.add("*/");
    }


}
