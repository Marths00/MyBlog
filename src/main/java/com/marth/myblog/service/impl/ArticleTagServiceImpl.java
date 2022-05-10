package com.marth.myblog.service.impl;

import com.marth.myblog.entity.ArticleTag;
import com.marth.myblog.mapper.ArticleTagMapper;
import com.marth.myblog.service.IArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章标签 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements IArticleTagService {

}
