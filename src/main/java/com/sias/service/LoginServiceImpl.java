package com.sias.service;

import com.sias.dao.LoginDao;
import com.sias.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginDao loginDao;
    @Override
    public User login(User user) {
        return loginDao.login(user);
    }
}
