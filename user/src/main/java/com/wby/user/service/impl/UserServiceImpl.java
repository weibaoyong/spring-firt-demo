package com.wby.user.service.impl;

import com.wby.user.dao.UserDao;
import com.wby.user.mapper.AddressMapper;
import com.wby.user.mapper.UserMapper;
import com.wby.user.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@ComponentScan({"com.wby.user.mapper"})
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private AddressMapper addressMapper;

    @Override
    public void insert(UserDao userBean) {
        userMapper.insert(userBean);
        addressMapper.insert(userBean.getAddressDao());
    }

    @Override
    public void update(UserDao userBean) {
        userMapper.update(userBean);
    }

    @Override
    public UserDao findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public List<UserDao> findList() {
        return userMapper.findList();
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }
}
