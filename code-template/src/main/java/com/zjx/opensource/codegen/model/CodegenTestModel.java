package com.zjx.opensource.codegen.model;

import com.zjx.opensource.codegen.exception.ServiceException;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * 对应数据库表: codegen_test_model
 */
public class CodegenTestModel implements Serializable {
    /**
     *
     * 对应数据库表字段: codegen_test_model.id
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    private Long id;

    /**
     *
     * 对应数据库表字段: codegen_test_model.username
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    private String username;

    /**
     *
     * 对应数据库表字段: codegen_test_model.password
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    private String password;

    /**
     *
     * 对应数据库表字段: codegen_test_model.type
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    private String type;

    /**
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    private static final long serialVersionUID = 1L;

    /**
    * djoejrgohtkmnjefgrhkltmnjbhr
    */
    @NotNull
    private static CodegenTestModel model;

    /**
     * 返回值对应数据库表字段:  codegen_test_model.id
     *
     * @return  codegen_test_model.id
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public Long getId() {
        return id;
    }

    /**
     * 给对应数据库表字段设值：  codegen_test_model.id
     *
     * @param id 对应数据库表字段:  codegen_test_model.id
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返回值对应数据库表字段:  codegen_test_model.username
     *
     * @return  codegen_test_model.username
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public String getUsername() {
        return username;
    }

    /**
     * 给对应数据库表字段设值：  codegen_test_model.username
     *
     * @param username 对应数据库表字段:  codegen_test_model.username
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 返回值对应数据库表字段:  codegen_test_model.password
     *
     * @return  codegen_test_model.password
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public String getPassword() {
        return password;
    }

    /**
     * 给对应数据库表字段设值：  codegen_test_model.password
     *
     * @param password 对应数据库表字段:  codegen_test_model.password
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 返回值对应数据库表字段:  codegen_test_model.type
     *
     * @return  codegen_test_model.type
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public String getType() {
        return type;
    }

    /**
     * 给对应数据库表字段设值：  codegen_test_model.type
     *
     * @param type 对应数据库表字段:  codegen_test_model.type
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
    * 将model类中的非null字段转化为Example中的条件
    * @mbg.generated
    */
    public CodegenTestModelExample toExample() {
        CodegenTestModelExample example = new CodegenTestModelExample();
        CodegenTestModelExample.Criteria criteria = example.createCriteria();
        if (id != null) {
            criteria.andIdEqualTo(id);
        }
        if (username != null) {
            criteria.andUsernameEqualTo(username);
        }
        if (password != null) {
            criteria.andPasswordEqualTo(password);
        }
        if (type != null) {
            criteria.andTypeEqualTo(type);
        }
        return example;
    }

    /**
    * dfjgrothngkl;fskdgd
    */
    @NotNull
    public CodegenTestModel() {
        
    }

    public CodegenTestModel( Long id) {
        this.id = id;
    }

    /**
    * 将model类中的非null字段转化为Example中的条件
    */
    @NotNull
    public ServiceException toExample123(@NotNull String aaa) throws Exception {
        
        CodegenTestModelExample example = new CodegenTestModelExample();
        CodegenTestModelExample.Criteria criteria = example.createCriteria();
        if (id != null) {
            criteria.andIdEqualTo(id);
        }
        if (username != null) {
            criteria.andUsernameEqualTo(username);
        }
        if (password != null) {
            criteria.andPasswordEqualTo(password);
        }
        if (type != null) {
            criteria.andTypeEqualTo(type);
        }
        return new ServiceException();
    }
}