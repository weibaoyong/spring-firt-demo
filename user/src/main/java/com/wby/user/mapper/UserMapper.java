package com.wby.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wby.user.dao.UserDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserDao> {

    public int insert(UserDao userBean);

    public void update(UserDao userBean);

    public UserDao findById(int id);

    public List<UserDao> findList();

    public void delete(int id);
}
