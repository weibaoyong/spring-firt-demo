package com.wby.user.controller;

import com.wby.user.dao.AddressDao;
import com.wby.user.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/insert")
    public void insert(AddressDao addressDao){
        addressService.insert(addressDao);
    }

    @PostMapping("/update")
    public void update(AddressDao addressDao){
        addressService.update(addressDao);
    }
}
