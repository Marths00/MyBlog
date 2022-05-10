package com.marth.myblog.service.impl;

import com.marth.myblog.entity.Link;
import com.marth.myblog.mapper.LinkMapper;
import com.marth.myblog.service.ILinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 友情连接 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements ILinkService {

}
