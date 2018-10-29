package com.qcj.dao.impl;

import com.qcj.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao2")//跟@Component效果一样的，但是他是component的语义化，分层
public class UserDaoImpl2 implements UserDao {
    @Override
    public void addUser() {
        System.out.println("add2");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete2");
    }
}
