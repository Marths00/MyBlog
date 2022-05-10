package com.marth.myblog.service.impl;

import com.marth.myblog.entity.AdType;
import com.marth.myblog.mapper.AdTypeMapper;
import com.marth.myblog.service.IAdTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 广告类型 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class AdTypeServiceImpl extends ServiceImpl<AdTypeMapper, AdType> implements IAdTypeService {

}
