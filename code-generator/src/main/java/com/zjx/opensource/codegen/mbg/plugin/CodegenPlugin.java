package com.zjx.opensource.codegen.mbg.plugin;

import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

public class CodegenPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return false;
    }
}
