package com.zjx.opensource.codetemplate.mapper;

import com.zjx.opensource.codetemplate.model.CodeGenTest;
import com.zjx.opensource.codetemplate.model.CodeGenTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeGenTestMapper {
    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    long countByExample(CodeGenTestExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int deleteByExample(CodeGenTestExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int insert(CodeGenTest record);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int insertSelective(CodeGenTest record);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    List<CodeGenTest> selectByExample(CodeGenTestExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int updateByExampleSelective(@Param("record") CodeGenTest record, @Param("example") CodeGenTestExample example);

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    int updateByExample(@Param("record") CodeGenTest record, @Param("example") CodeGenTestExample example);
}