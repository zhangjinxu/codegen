package com.zjx.opensource.codegen.controller;

import com.zjx.opensource.codegen.model.CodegenTestModel;
import com.zjx.opensource.codegen.service.CodegenTestModelService;
import com.zjx.opensource.codegen.util.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CodegenTestModelController {

    private static final Logger logger = LoggerFactory.getLogger(CodegenTestModelController.class);

    @Autowired
    private CodegenTestModelService codegenTestModelService;

    @RequestMapping(value = "/codegenTestModel/{id}",method = RequestMethod.GET)
    public ResponseResult getById(@PathVariable("id") int id) {
        CodegenTestModel model = codegenTestModelService.getById(id);
        return ResponseResult.getSuccessResult(model);
    }

    @RequestMapping(value = "/codegenTestModels",method = RequestMethod.GET)
    public ResponseResult getModels(@RequestParam(defaultValue = "1") int pageNum, CodegenTestModel model) {
        List<CodegenTestModel> models = codegenTestModelService.listCodegenTestModels(pageNum, model);
        return ResponseResult.getSuccessResult(models);
    }

    @RequestMapping(value="/codegenTestModel",method = RequestMethod.PUT)
    public ResponseResult updateModel(CodegenTestModel model) {
        if (model == null || model.getId() == null) {
            return ResponseResult.getParamErrorResult();
        }
        codegenTestModelService.updateByIdSelective(model);
        return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value="/codegenTestModel",method = RequestMethod.POST)
    public ResponseResult addModel(CodegenTestModel model) {
        if (model == null || model.getId() != null) {
            return ResponseResult.getParamErrorResult();
        }
        codegenTestModelService.addSelective(model);
        return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value = "/codegenTestModel/{id}",method = RequestMethod.DELETE)
    public ResponseResult deleteModel(@PathVariable("id") int id) {
        codegenTestModelService.deleteById(id);
        return ResponseResult.getSuccessResult();
    }
}
