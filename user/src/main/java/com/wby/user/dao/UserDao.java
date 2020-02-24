package com.wby.user.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
@TableName(value = "tb_user")
public class UserDao {

    @TableId(type = IdType.AUTO)
    private int id;
    private String userName;
    private String passWord;
    private String userPhone;
    private Integer age;
    private Integer sex;
    private String email;

    @TableField(exist = false)
    private List<AddressDao> addressDaoList;

    @TableField(exist = false)
    @JsonIgnore
    private AddressDao addressDao;

}
