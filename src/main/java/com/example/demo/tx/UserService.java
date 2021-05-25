package com.example.demo.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: demo
 * @create: 2021-05-12
 **/

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void insertUser1(){
//        userDao.insert();
//        System.out.println("insert complete1");
//        int i = 10 / 0;
        insertUser2();
    }
    @Transactional
    public void insertUser2(){
        try {

            userDao.insert();
            System.out.println("insert complete1");
            int i = 10 / 0;
        }catch (Exception e){

        }
    }
}
