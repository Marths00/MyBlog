package com.marth.myblog.service.impl;

import com.marth.myblog.entity.Comment;
import com.marth.myblog.mapper.CommentMapper;
import com.marth.myblog.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章评论 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
