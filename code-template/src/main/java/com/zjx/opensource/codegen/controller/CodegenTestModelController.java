package com.zjx.opensource.codegen.controller;

import com.zjx.opensource.codegen.model.CodegenTestModel;
import com.zjx.opensource.codegen.service.CodegenTestModelService;

import com.github.pagehelper.PageInfo;
import com.zjx.opensource.codegen.util.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CodegenTestModelController {

    private static final Logger logger = LoggerFactory.getLogger(CodegenTestModelController.class);

    @Autowired
    private CodegenTestModelService codegenTestModelService;

    @RequestMapping(value = "/codegenTestModel/{id}",method = RequestMethod.GET)
    public ResponseResult getById(@PathVariable("id") int id) {
        CodegenTestModel codegenTestModel = codegenTestModelService.getById(id);
        return ResponseResult.getSuccessResult(codegenTestModel);
    }

    @RequestMapping(value = "/codegenTestModels",method = RequestMethod.GET)
    public ResponseResult listcodegenTestModels(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "10")int pageSize, CodegenTestModel codegenTestModel) {
        PageInfo<CodegenTestModel> pageInfo = codegenTestModelService.listCodegenTestModel(pageNum,pageSize, codegenTestModel);
        return ResponseResult.getSuccessResult(pageInfo);
    }

    @RequestMapping(value="/codegenTestModel",method = RequestMethod.PUT)
    public ResponseResult updateCodegenTestModel(CodegenTestModel codegenTestModel) {
        if (codegenTestModel == null || codegenTestModel.getId() == null) {
            return ResponseResult.getParamErrorResult();
        }
        codegenTestModelService.updateByIdSelective(codegenTestModel);
        return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value="/codegenTestModel",method = RequestMethod.POST)
    public ResponseResult addCodegenTestModel(CodegenTestModel codegenTestModel) {
        if (codegenTestModel == null || codegenTestModel.getId() != null) {
            return ResponseResult.getParamErrorResult();
        }
        codegenTestModelService.insertSelective(codegenTestModel);
        return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value = "/codegenTestModel/{id}",method = RequestMethod.DELETE)
    public ResponseResult deleteCodegenTestModel(@PathVariable("id") int id) {
        codegenTestModelService.deleteById(id);
        return ResponseResult.getSuccessResult();
    }
}
