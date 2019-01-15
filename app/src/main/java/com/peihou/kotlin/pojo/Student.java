package com.peihou.kotlin.pojo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Student {
    @Id(autoincrement = true)
    private Long id;
    private String username;
    private int age;
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 779448599)
    public Student(Long id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Student(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Generated(hash = 1556870573)
    public Student() {
    }
}
