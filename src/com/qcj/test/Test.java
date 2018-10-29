package com.qcj.test;

import com.qcj.dao.UserDao;
import com.qcj.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*没有service层测试*/
        //加载容器
        /*ApplicationContext context = new ClassPathXmlApplicationContext("com/qcj/config/applicationContext.xml");
        //从容器中获取对象
        //UserDao userDao = context.getBean("userDao",UserDao.class);//接口
        UserDao userDao = context.getBean("userDao2",UserDao.class);
        userDao.addUser();
        userDao.deleteUser();*/

        /*有service层测试
        *    按照类型注入：
        *    按照名称注入： 一般用这个好
        * */
        ApplicationContext context = new ClassPathXmlApplicationContext("com/qcj/config/applicationContext.xml");
        //从容器中获取对象
        UserService userService = context.getBean("userService",UserService.class);
        userService.addUser();
        userService.deleteUser();
    }
}
