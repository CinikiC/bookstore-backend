package com.ciniki.bookstore.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
@Table(name = "USER")
@JsonIgnoreProperties({
        "handler",
        "hibernateLazyInitializer"
})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")

    //User 类数据成员，和数据库中实体 USER 对应
    int uid;            //用户唯一 id
    String username;    //用户名
    String password;    //用户口令

    //User 类可用方法
    //获取唯一识别 id，返回该对象的 uid
    public int getUid() {
        return uid;
    }

    //获取用户名，返回该对象的 username
    public String getUsername() {
        return username;
    }

    //获取密码，返回该对象的 password
    public String getPassword() {
        return password;
    }

    //设置用户名，参数为修改后的用户名
    public void setUsername(String username) {
        this.username = username;
    }

    //设置密码，参数为修改后的口令
    public void setPassword(String password) {
        this.password = password;
    }

    //修改用户唯一识别号码，参数为修改后的 uid
    public void setUid(int uid) {
        this.uid = uid;
    }
}
