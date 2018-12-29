package com.zjx.opensource.codegen.mbg.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CodegenPlugin extends PluginAdapter {

    private String sqlMapTargetPackage;

    private String sqlMapTargetProject;

    private String javaModelTargetPackage;

    private String javaModelTargetProject;

    private String mapperTargetPackage;

    private String mapperTargetProject;

    private String serviceTargetProject;

    private String serviceTargetPackage;

    private String controllerTargetProject;

    private String controllerTargetPackage;

    private boolean backup;

    private String backupDirectory;

    private String javaModelName;


    public CodegenPlugin() { }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        this.serviceTargetProject = super.properties.getProperty("serviceTargetProject","");
        this.serviceTargetPackage = super.properties.getProperty("serviceTargetPackage", "");
        this.controllerTargetProject = super.properties.getProperty("controllerTargetProject", "");
        this.controllerTargetPackage = super.properties.getProperty("controllerTargetPackage", "");
        this.backup = Boolean.valueOf(super.properties.getProperty("backup", "true"));
        String backupDirectory = super.properties.getProperty("backupDirectory", "");
        if ("".equals(backupDirectory)) {
            //throw new RuntimeException("指定备份目录不能为空");
        }
        this.backupDirectory = backupDirectory;

        this.sqlMapTargetPackage = super.context.getSqlMapGeneratorConfiguration().getTargetPackage();
        this.sqlMapTargetPackage = this.sqlMapTargetPackage.replace(".", File.separator);
        this.sqlMapTargetProject = super.context.getSqlMapGeneratorConfiguration().getTargetProject();
        this.javaModelTargetPackage = super.context.getJavaModelGeneratorConfiguration().getTargetPackage();
        this.javaModelTargetPackage = this.javaModelTargetPackage.replace(".", File.separator);
        this.javaModelTargetProject = super.context.getJavaModelGeneratorConfiguration().getTargetProject();
        this.mapperTargetPackage = super.context.getJavaClientGeneratorConfiguration().getTargetPackage();
        this.mapperTargetPackage = this.mapperTargetPackage.replace(".", File.separator);
        this.mapperTargetProject = super.context.getJavaClientGeneratorConfiguration().getTargetProject();

    }


    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable table) {
        //1.获取要被覆盖的model,mapper,service,controller文件路径
        List<String> overrideFilesPath = getOverrideFilesPath(table.getAliasedFullyQualifiedTableNameAtRuntime());

        List<File> backupFiles;
        //2.备份会被覆盖的文件
        if (backup) {
            backupFiles = backupFiles(overrideFilesPath);
        }else {
            backupFiles = toFiles(overrideFilesPath);
        }

        //3.缓存没加注解的字段或方法
        cacheContent(backupFiles);

        //4.获取已生成的文件，将缓存的内容添加进去
        addCacheContent();
    }

    private List<File> toFiles(List<String> overrideFilesPath) {
        return null;
    }

    private void addCacheContent() {
    }

    private void cacheContent(List<File> backupFiles) {
    }

    private List<File> backupFiles(List<String> overrideFilesPath) {

        return null;
    }

    private List<String> getOverrideFilesPath(String tableName) {
        initJavaModelName(tableName);

        //service
        List<String> filesPath = getServiceFilesPath();

        //controller
        String controllerFilesPath = getControllerFilesPath();

        //mapper
        String mapperFilesPath = getMapperFilesPath();

        return filesPath;
    }

    private List<String> getServiceFilesPath() {
        List<String> filesPath = new ArrayList<>();



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


    private String getMapperFilesPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(mapperTargetProject);
        if (!mapperTargetProject.endsWith(File.separator)) {
            sb.append(File.separator);
        }
        sb.append(mapperTargetPackage);
        if (!mapperTargetPackage.endsWith(File.separator)) {
            sb.append(File.separator);
        }
        sb.append(javaModelName).append("Mapper").append(".java");
        return sb.toString();
    }

    private void initJavaModelName(String tableName) {
        if (tableName == null || "".equals(tableName)) {
            throw new RuntimeException("tableName is empty!");
        }
        StringBuilder modelName = new StringBuilder(tableName);

        modelName.setCharAt(0, Character.toUpperCase(modelName.charAt(0)));

        while (true) {
            int index = modelName.indexOf("_");
            if (index == -1 || index == modelName.length() - 1) {
                break;
            }
            modelName.deleteCharAt(index);
            modelName.setCharAt(index, Character.toUpperCase(modelName.charAt(index)));
        }
        this.javaModelName = modelName.toString();
    }

    public static void main(String[] args) {

    }

}
