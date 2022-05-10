package com.marth.myblog.service.impl;

import com.marth.myblog.entity.ArticleTagList;
import com.marth.myblog.mapper.ArticleTagListMapper;
import com.marth.myblog.service.IArticleTagListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章对应标签 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class ArticleTagListServiceImpl extends ServiceImpl<ArticleTagListMapper, ArticleTagList> implements IArticleTagListService {

}
