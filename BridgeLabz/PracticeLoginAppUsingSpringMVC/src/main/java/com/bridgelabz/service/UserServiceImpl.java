package com.bridgelabz.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.model.Login;
import com.bridgelabz.model.User;

public class UserServiceImpl implements UserService {
  static {
    System.out.println("UserServiceImpl POJO class::static block");
  }

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
