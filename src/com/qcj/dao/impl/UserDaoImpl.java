package com.qcj.dao.impl;

import com.qcj.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")// 注解创建一个对象 默认跟类的名称一样，也可以起个名字
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("add");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete");
    }
}
