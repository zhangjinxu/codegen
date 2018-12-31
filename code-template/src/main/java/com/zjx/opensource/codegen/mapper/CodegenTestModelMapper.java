package com.zjx.opensource.codegen.mapper;

import com.zjx.opensource.codegen.model.CodegenTestModel;
import com.zjx.opensource.codegen.model.CodegenTestModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodegenTestModelMapper {
    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    long countByExample(CodegenTestModelExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int deleteByExample(CodegenTestModelExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int insert(CodegenTestModel record);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int insertSelective(CodegenTestModel record);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    List<CodegenTestModel> selectByExample(CodegenTestModelExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    CodegenTestModel selectByPrimaryKey(Long id);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int updateByExampleSelective(@Param("record") CodegenTestModel record, @Param("example") CodegenTestModelExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int updateByExample(@Param("record") CodegenTestModel record, @Param("example") CodegenTestModelExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int updateByPrimaryKeySelective(CodegenTestModel record);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int updateByPrimaryKey(CodegenTestModel record);
}