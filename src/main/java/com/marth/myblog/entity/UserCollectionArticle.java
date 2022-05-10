package com.marth.myblog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户收藏的文章
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserCollectionArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户收藏的文章id
     */
    @TableId("user_collection_article_id")
    private String userCollectionArticleId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 文章id
     */
    private String articleId;

    /**
     * 收藏时间
     */
    private LocalDateTime userCollectionArticleTime;


}
