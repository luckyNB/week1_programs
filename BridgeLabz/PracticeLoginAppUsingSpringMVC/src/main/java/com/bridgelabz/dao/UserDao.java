package com.bridgelabz.dao;

import com.bridgelabz.model.Login;
import com.bridgelabz.model.User;

public interface UserDao {



  void register(User user);

  User validateUser(Login login);
}
