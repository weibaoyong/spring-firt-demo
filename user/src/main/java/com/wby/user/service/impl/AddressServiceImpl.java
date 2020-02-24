package com.wby.user.service.impl;

import com.wby.user.dao.AddressDao;
import com.wby.user.mapper.AddressMapper;
import com.wby.user.service.AddressService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@ComponentScan({"com.wby.user.mapper"})
@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressMapper addressMapper;

    @Override
    public void insert(AddressDao addressDao) {
        addressMapper.insert(addressDao);
    }

    @Override
    public void update(AddressDao addressDao) {
        addressMapper.update(addressDao);
    }
}
