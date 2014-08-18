/**
 * 
 */
package com.dubbo.provider.impl;

import java.util.ArrayList;
import java.util.List;

import com.dubbo.provider.pojo.User;
import com.dubbo.provider.service.DubboService;

/** 
 * @Title: DubboImpl.java
 * @Author: xrma
 * @CreateTime: Aug 18, 2014 4:50:31 PM
 * @CodeReviewer: 
 * @ReviewTime: 
 * @Company: CFCA
 */

public class DubboImpl implements DubboService {

    /* (non-Javadoc)
     * @see com.dubbo.provider.service.DubboService#getUser()
     */
    @Override
    public List<User> getUser() {
        // TODO Auto-generated method stub
        List<User> userList = new ArrayList<User>();
        
        User user1 = new User();
        user1.setUserName("user1");
        user1.setSex("male");
        user1.setAge(10);
        
        User user2 = new User();
        user2.setUserName("user2");
        user2.setSex("female");
        user2.setAge(20);
        
        User user3 = new User();
        user3.setUserName("user3");
        user3.setSex("male");
        user3.setAge(30);
        
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        
        return userList;
    }

    /* (non-Javadoc)
     * @see com.dubbo.provider.service.DubboService#sayHello(java.lang.String)
     */
    @Override
    public String sayHello(String name) {
        // TODO Auto-generated method stub
        return "hello" + name;
    }

}
