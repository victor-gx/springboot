package com.gx.admin.service;

import com.gx.admin.bean.Account;
import com.gx.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface AccountService {

    Account getAcctByid(Long id);
}
