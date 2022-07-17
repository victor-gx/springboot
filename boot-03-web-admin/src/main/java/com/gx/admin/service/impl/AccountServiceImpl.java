package com.gx.admin.service.impl;

import com.gx.admin.bean.Account;
import com.gx.admin.mapper.AccountMapper;
import com.gx.admin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByid(Long id){
        return accountMapper.getAcct(id);
    }
}
