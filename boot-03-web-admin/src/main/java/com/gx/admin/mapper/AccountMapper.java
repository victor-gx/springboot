package com.gx.admin.mapper;

import com.gx.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface AccountMapper {


    public Account getAcct(Long id);
}