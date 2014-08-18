/**
 * 
 */
package com.dubbo.provider.pojo;

import java.io.Serializable;

/**
 * @Title: User.java
 * @Author: xrma
 * @CreateTime: Aug 18, 2014 4:47:39 PM
 * @CodeReviewer:
 * @ReviewTime:
 * @Company: CFCA
 */

public class User implements Serializable {
    private static final long serialVersionUID = 5661038397545500953L;

    private String userName;
    private String sex;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
