package com.wby.user.service;

import com.wby.user.dao.UserDao;

import java.util.List;

public interface UserService {

    public void insert(UserDao userBean);

    public void update(UserDao userBean);

    public UserDao findById(int id);

    public List<UserDao> findList();

    public void delete(int id);
}
