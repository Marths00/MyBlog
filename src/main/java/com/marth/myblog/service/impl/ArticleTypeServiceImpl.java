package com.marth.myblog.service.impl;

import com.marth.myblog.entity.ArticleType;
import com.marth.myblog.mapper.ArticleTypeMapper;
import com.marth.myblog.service.IArticleTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章分类i 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class ArticleTypeServiceImpl extends ServiceImpl<ArticleTypeMapper, ArticleType> implements IArticleTypeService {

}
