package com.zjx.opensource.codegen.mbg.plugin;

import com.zjx.opensource.codegen.util.Util;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CodegenPlugin extends PluginAdapter {

    private String serviceTargetProject;

    private String serviceTargetPackage;

    private String controllerTargetProject;

    private String controllerTargetPackage;

    private String javaModelName;

    public CodegenPlugin() { }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        this.serviceTargetProject = super.properties.getProperty("serviceTargetProject","");
        this.serviceTargetPackage = super.properties.getProperty("serviceTargetPackage", "");
        this.controllerTargetProject = super.properties.getProperty("controllerTargetProject", "");
        this.controllerTargetPackage = super.properties.getProperty("controllerTargetPackage", "");
    }


    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable table) {
        this.javaModelName = Util.getJavaModelName(table.getAliasedFullyQualifiedTableNameAtRuntime());

    }



    private List<String> getServiceFilesPath() {
        List<String> filesPath = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(serviceTargetProject);
        if (!serviceTargetProject.endsWith(File.separator)) {
            sb.append(File.separator);
        }
        sb.append(serviceTargetPackage);
        if (!serviceTargetPackage.endsWith(File.separator)) {
            sb.append(File.separator);
        }
        sb.append(javaModelName).append("Service").append(".java");
        filesPath.add(sb.toString());
        sb.setLength(0);


        sb.append(serviceTargetProject);
        if (!serviceTargetProject.endsWith(File.separator)) {
            sb.append(File.separator);
        }
        sb.append(serviceTargetPackage);
        if (!serviceTargetPackage.endsWith(File.separator)) {
            sb.append(File.separator);
        }
        sb.append("impl").append(File.separator);
        sb.append(javaModelName).append("ServiceImpl").append(".java");
        filesPath.add(sb.toString());
        return filesPath;
    }

    private String getControllerFilesPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(controllerTargetProject);
        if (!controllerTargetProject.endsWith(File.separator)) {
            sb.append(File.separator);
        }
        sb.append(controllerTargetPackage);
        if (!controllerTargetPackage.endsWith(File.separator)) {
            sb.append(File.separator);
        }
        sb.append(javaModelName).append("Controller").append(".java");
        return sb.toString();
    }

}
