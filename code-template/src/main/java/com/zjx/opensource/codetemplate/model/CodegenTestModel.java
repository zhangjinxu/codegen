package com.zjx.opensource.codetemplate.model;

import java.io.Serializable;

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
    private Integer id;

    /**
     *   用户名
     *
     * 对应数据库表字段: codegen_test_model.username
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    private String username;

    /**
     *   密码
     *
     * 对应数据库表字段: codegen_test_model.password
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    private String password;

    /**
     *   用户类型
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
     * 返回值对应数据库表字段:  codegen_test_model.id
     *
     * @return  codegen_test_model.id
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public Integer getId() {
        return id;
    }

    /**
     * 给对应数据库表字段设值：  codegen_test_model.id
     *
     * @param id 对应数据库表字段:  codegen_test_model.id
     * @mbg.generated eclipse插件识别是否覆盖的注解
     */
    public void setId(Integer id) {
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
}