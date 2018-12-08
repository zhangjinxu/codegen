package com.zjx.opensource.codegen.service;

import com.zjx.opensource.codegen.model.CodegenTestModel;

import java.util.List;

public interface CodegenTestModelService {

    CodegenTestModel getById(Integer id);

    void addSelective(CodegenTestModel codegenTestModel);

    void updateSelectiveById(CodegenTestModel codegenTestModel);

    void deleteById(Integer id);

    List<CodegenTestModel> listCodegenTestModels(int pageNum, CodegenTestModel model);
}
