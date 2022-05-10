package com.marth.myblog.service.impl;

import com.marth.myblog.entity.Admin;
import com.marth.myblog.mapper.AdminMapper;
import com.marth.myblog.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
