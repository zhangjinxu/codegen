package com.zjx.opensource.codegen.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.zjx.opensource.codegen.model.CodegenTestModel;

import java.util.List;

public interface CodegenTestModelService {

    CodegenTestModel getById(Integer id);

    void insertSelective(CodegenTestModel codegenTestModel);

    void updateByIdSelective(CodegenTestModel codegenTestModel);

    void deleteById(Integer id);

    PageInfo<CodegenTestModel> listCodegenTestModels(int pageNum, int pageSize, CodegenTestModel model);
}
