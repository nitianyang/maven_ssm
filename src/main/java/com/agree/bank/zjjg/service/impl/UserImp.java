package com.agree.bank.zjjg.service.impl;

import com.agree.bank.zjjg.dao.UserDao;
import com.agree.bank.zjjg.pojo.Users;
import com.agree.bank.zjjg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserImp implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    public Users selectById(Integer id) {
        System.out.println("执行dao底层服务啦。。。。。");
        return userDao.selectById(id);
    }
}
