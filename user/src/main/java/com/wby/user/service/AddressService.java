package com.wby.user.service;

import com.wby.user.dao.AddressDao;
import com.wby.user.dao.UserDao;

public interface AddressService  {

    public void insert(AddressDao addressDao);

    public void update(AddressDao addressDao);
}
