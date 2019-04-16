package com.sparrow.protocol;

/**
 * login query dto
 *
 * @author harry
 */
public class LoginQueryDTO {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 验证码
     */
    private String validateCode;
    /**
     * 用户输入的验证码
     */
    private String userValidateCode;

    /**
     * 记住密码
     */
    private Boolean remember;

    private ClientInformation client;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public String getUserValidateCode() {
        return userValidateCode;
    }

    public void setUserValidateCode(String userValidateCode) {
        this.userValidateCode = userValidateCode;
    }

    public Boolean getRemember() {
        return remember;
    }

    public void setRemember(Boolean remember) {
        this.remember = remember;
    }

    public ClientInformation getClient() {
        return client;
    }

    public void setClient(ClientInformation client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "LoginQueryDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", validateCode='" + validateCode + '\'' +
                ", userValidateCode='" + userValidateCode + '\'' +
                ", remember=" + remember +
                ", client=" + client +
                '}';
    }
}
