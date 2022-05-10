package com.marth.myblog.service.impl;

import com.marth.myblog.entity.UserCollectionArticle;
import com.marth.myblog.mapper.UserCollectionArticleMapper;
import com.marth.myblog.service.IUserCollectionArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户收藏的文章 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class UserCollectionArticleServiceImpl extends ServiceImpl<UserCollectionArticleMapper, UserCollectionArticle> implements IUserCollectionArticleService {

}
