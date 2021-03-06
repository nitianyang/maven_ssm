package com.agree.bank.zjjg.pojo;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Users implements Serializable {
    private Integer id;
    @NotBlank(message = "用户名不能为空！")
    private String name;
    @NotBlank(message = "用密码不能为空！")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
