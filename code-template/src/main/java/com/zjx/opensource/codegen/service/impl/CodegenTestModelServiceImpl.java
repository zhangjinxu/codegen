package com.zjx.opensource.codegen.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjx.opensource.codegen.mapper.CodegenTestModelMapper;
import com.zjx.opensource.codegen.model.CodegenTestModel;
import com.zjx.opensource.codegen.service.CodegenTestModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CodegenTestModelServiceImpl implements CodegenTestModelService {

    private static final Logger logger = LoggerFactory.getLogger(CodegenTestModelServiceImpl.class);

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
    public void insertSelective(CodegenTestModel codegenTestModel) {
        codegenTestModelMapper.insertSelective(codegenTestModel);
    }

    @Override
    public void updateByIdSelective(CodegenTestModel codegenTestModel) {
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
    public PageInfo<CodegenTestModel> listCodegenTestModels(int pageNum, int pageSize, CodegenTestModel model) {
        PageHelper.startPage(pageNum, pageSize);
        List<CodegenTestModel> models = codegenTestModelMapper.selectByExample(model.toExample());
        PageInfo<CodegenTestModel> pageInfo = new PageInfo<>(models);
        return pageInfo;
    }


}
