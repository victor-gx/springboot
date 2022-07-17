package com.gx.admin.service.impl;

import com.gx.admin.bean.User;
import com.gx.admin.mapper.UserMapper;
import com.gx.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {


}