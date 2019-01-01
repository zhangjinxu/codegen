package com.zjx.opensource.codegen.service;

import com.github.pagehelper.PageInfo;
import com.zjx.opensource.codegen.model.CodegenTestModel;

public interface CodegenTestModelService {

    CodegenTestModel getById(int id);

    void insertSelective(CodegenTestModel codegenTestModel);

    void updateByIdSelective(CodegenTestModel codegenTestModel);

    void deleteById(int id);

    PageInfo<CodegenTestModel> listCodegenTestModel(int pageNum, int pageSize, CodegenTestModel codegenTestModel);
}
