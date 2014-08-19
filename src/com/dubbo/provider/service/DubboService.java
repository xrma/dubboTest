/**
 * 
 */
package com.dubbo.provider.service;

import java.util.List;

import com.dubbo.provider.pojo.User;

/** 
 * @Title: DubboService.java
 * @Author: xrma
 * @CreateTime: Aug 18, 2014 4:44:54 PM
 * @CodeReviewer: 
 * @ReviewTime: 
 * @Company: CFCA
 */
public interface DubboService {
    public String sayHello(String name);
    public List<User> getUser();
}
