package com.marth.myblog.service.impl;

import com.marth.myblog.entity.Article;
import com.marth.myblog.mapper.ArticleMapper;
import com.marth.myblog.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
