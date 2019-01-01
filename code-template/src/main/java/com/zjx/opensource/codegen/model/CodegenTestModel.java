package com.zjx.opensource.codegen.model;

import com.zjx.opensource.codegen.exception.ServiceException;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * 对应表: codegen_test_model
 */
public class CodegenTestModel implements Serializable {
    /**
     *
     * 对应字段: codegen_test_model.id
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * 对应字段: codegen_test_model.username
     * @mbg.generated
     */
    private String username;

    /**
     *
     * 对应字段: codegen_test_model.password
     * @mbg.generated
     */
    private String password;

    /**
     *
     * 对应字段: codegen_test_model.type
     * @mbg.generated
     */
    private String type;

    /**
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
    * djoejrgohtkmnjefgrhkltmnjbhr
    */
    @NotNull
    private static CodegenTestModel model;

    /**
     * 对应字段: codegen_test_model.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * 对应字段: codegen_test_model.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 对应字段: codegen_test_model.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * 对应字段: codegen_test_model.username
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 对应字段: codegen_test_model.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * 对应字段: codegen_test_model.password
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 对应字段: codegen_test_model.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * 对应字段: codegen_test_model.type
     * @mbg.generated
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