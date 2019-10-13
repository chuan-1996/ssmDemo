package com.chuan.service.vo;

/**
 * @author qq491
 */
public class UserVO {
    private Integer id;

    private String username;

    private String realname;

    private String passwd;

    private String salt;

    private String role;

    public UserVO(Integer id, String username, String realname, String passwd, String salt, String role) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.passwd = passwd;
        this.salt = salt;
        this.role = role;
    }

    public UserVO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}