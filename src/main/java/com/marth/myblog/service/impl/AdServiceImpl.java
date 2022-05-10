package com.marth.myblog.service.impl;

import com.marth.myblog.entity.Ad;
import com.marth.myblog.mapper.AdMapper;
import com.marth.myblog.service.IAdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements IAdService {

}
