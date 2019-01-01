package com.zjx.opensource.codegen.mapper;

import com.zjx.opensource.codegen.model.CodegenTestModel;
import com.zjx.opensource.codegen.model.CodegenTestModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodegenTestModelMapper {
    /**
     * @mbg.generated
     */
    long countByExample(CodegenTestModelExample example);

    /**
     * @mbg.generated
     */
    int deleteByExample(CodegenTestModelExample example);

    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int insert(CodegenTestModel record);

    /**
     * @mbg.generated
     */
    int insertSelective(CodegenTestModel record);

    /**
     * @mbg.generated
     */
    List<CodegenTestModel> selectByExample(CodegenTestModelExample example);

    /**
     * @mbg.generated
     */
    CodegenTestModel selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CodegenTestModel record, @Param("example") CodegenTestModelExample example);

    /**
     * @mbg.generated
     */
    int updateByExample(@Param("record") CodegenTestModel record, @Param("example") CodegenTestModelExample example);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CodegenTestModel record);

    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(CodegenTestModel record);
}