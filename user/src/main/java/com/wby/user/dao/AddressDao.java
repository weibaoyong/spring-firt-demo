package com.wby.user.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_address")
public class AddressDao {

    public int addressId;
    public int userId;
    public String province;
    public String city;
    public String region;
    public String userAddress;
}
