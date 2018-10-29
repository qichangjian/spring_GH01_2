package com.qcj.service.impl;

import com.qcj.dao.UserDao;
import com.qcj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")//创建一个service层对象  只是创建，需要被扫描（在配置文件中配置扫描位置）
public class UserServiceImpl implements UserService {

    //按照类型注入： 是接口只能有一个实现类
    /*@Autowired  //按照类型来实现注入：按照配置文件看谁是它属性对象就给注入了  可以在属性上写  也可以在方法上写（没必要）
    UserDao userDao;*/

    //按照名称注入： 接口可以有多个实现类 ，因为加入了名字
    @Autowired  //按照类型来实现注入
    @Qualifier("userDao2")//按照名称注入:  类型+名称：就能实现多个dao的注入
    UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
    }

    @Override
    public void deleteUser() {
        userDao.deleteUser();
    }
}
