package com.marth.myblog.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.marth.myblog.common.lang.Result;
import com.marth.myblog.entity.Article;
import com.marth.myblog.service.IArticleService;
import com.marth.myblog.util.ShiroUtil;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * <p>
 * 文章 前端控制器
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@RestController
@RequestMapping("")
public class ArticleController {
    @Autowired
    IArticleService articleService;
    @GetMapping("/blogs")
    public Result blogs(Integer currentPage) {
        if(currentPage == null || currentPage < 1) currentPage = 1;
        Page page = new Page(currentPage, 5);
        IPage pageData = articleService.page(page, new QueryWrapper<Article>().orderByDesc("article_add_time"));
        return Result.succ(pageData);
    }


    @GetMapping("/blog/{blogId}")
    public Result detail(@PathVariable(name = "blogId") Long id) {
        Article article = articleService.getById(id);
        Assert.notNull(article, "该博客已删除！");
        return Result.succ(article);
    }

    @GetMapping("/blog/{blogId}/del")
    public Result del(@PathVariable(name = "blogId") Long id){
        if(id!= null){
            if (articleService.getById(id)==null)
            {
//                System.out.println("no exist");
                return Result.fail(null);
            }else {
                articleService.removeById(id);
                return Result.succ(null);
            }
        }else {
//            System.out.println("error");
            return Result.fail(null);
        }
    }



    @RequiresAuthentication
    @PostMapping("/blog/edit")
    public Result edit(@Validated @RequestBody Article article) {
//        Map<String,String> map
//        Article article=new Article();
//        article.setArticleId(map.get("id"));article.setArticleTitle(map.get("title"));article.setArticleTypeId(map.get("description"));article.setArticleContext(map.get("content"));
        System.out.println(article.toString());

        Article temp = null;

        if(article.getArticleId() != null) {

            temp = articleService.getById(article.getArticleId());

            Assert.isTrue(temp.getUserId().equals(ShiroUtil.getProfile().getUserId()) , "没有权限编辑");

        } else {

            temp = new Article();

            temp.setUserId(ShiroUtil.getProfile().getUserId());

            temp.setArticleAddTime(LocalDateTime.now());

            temp.setArticleHot(0);

        }

        BeanUtil.copyProperties(article, temp, "articleId", "userId", "articleAddTime", "articleHot");

        articleService.saveOrUpdate(temp);

        return Result.succ(null);

    }


}
