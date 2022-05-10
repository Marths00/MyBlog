package com.marth.myblog.service.impl;

import com.marth.myblog.entity.User;
import com.marth.myblog.mapper.UserMapper;
import com.marth.myblog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
