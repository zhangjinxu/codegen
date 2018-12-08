package com.zjx.opensource.codetemplate.controller;

import com.zjx.opensource.codetemplate.model.CodegenTestModel;
import com.zjx.opensource.codetemplate.service.CodegenTestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CodegenTestModelController {

    @Autowired
    private CodegenTestModelService codegenTestModelService;

    @RequestMapping(value = "/codegenTestModel/{id}",method = RequestMethod.GET)
    public CodegenTestModel getById(@PathVariable("id") int id) {
        return codegenTestModelService.getById(id);
    }

    @RequestMapping(value = "/codegenTestModels",method = RequestMethod.GET)
    public List<CodegenTestModel> getModels(@RequestParam int pageNum, CodegenTestModel model) {
        return codegenTestModelService.listCodegenTestModels(pageNum, model);
    }

    @RequestMapping(value="/codegenTestModel",method = RequestMethod.PUT)
    public CodegenTestModel updateModel(CodegenTestModel model) {
        codegenTestModelService.addSelective(model);
        return model;
    }

    @RequestMapping(value="/codegenTestModel",method = RequestMethod.POST)
    public CodegenTestModel addModel(CodegenTestModel model) {
        codegenTestModelService.addSelective(model);
        return model;
    }

    @RequestMapping(value = "/codegenTestModel/{id}",method = RequestMethod.DELETE)
    public void deleteModel(@PathVariable("id") int id) {
        codegenTestModelService.deleteById(id);
    }
}
