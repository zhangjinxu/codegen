package com.zjx.opensource.codetemplate.service.impl;

import com.zjx.opensource.codetemplate.mapper.CodegenTestModelMapper;
import com.zjx.opensource.codetemplate.model.CodegenTestModel;
import com.zjx.opensource.codetemplate.service.CodegenTestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CodegenTestModelServiceImpl implements CodegenTestModelService {

    @Autowired
    private CodegenTestModelMapper codegenTestModelMapper;

    @Override
    public CodegenTestModel getById(Integer id) {
        if (id != null && id >= 0) {
            return codegenTestModelMapper.selectByPrimaryKey(id);
        }
        return null;
    }

    @Override
    public void addSelective(CodegenTestModel codegenTestModel) {
        codegenTestModelMapper.insertSelective(codegenTestModel);
    }

    @Override
    public void updateSelectiveById(CodegenTestModel codegenTestModel) {
        if (codegenTestModel != null && codegenTestModel.getId() != null) {
            codegenTestModelMapper.updateByPrimaryKeySelective(codegenTestModel);
        }
    }

    @Override
    public void deleteById(Integer id) {
        if (id != null && id >= 0) {
            codegenTestModelMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<CodegenTestModel> listCodegenTestModels(int pageNum, CodegenTestModel model) {

        return null;
    }
}
