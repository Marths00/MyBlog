package com.marth.myblog.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章对应标签
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ArticleTagList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章对应标签id
     */
    @TableId("article_tag_list_id")
    private String articleTagListId;

    /**
     * 文章id
     */
    private String articleId;

    /**
     * 文章标签id
     */
    private String articleTagId;


}
