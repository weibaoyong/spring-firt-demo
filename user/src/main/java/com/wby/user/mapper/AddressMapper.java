package com.wby.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wby.user.dao.AddressDao;
import com.wby.user.dao.UserDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper extends BaseMapper<AddressDao> {

    public int insert(AddressDao addressDao);

    public void update(AddressDao addressDao);
}
