package com.marth.myblog.service.impl;

import com.marth.myblog.entity.CommentReply;
import com.marth.myblog.mapper.CommentReplyMapper;
import com.marth.myblog.service.ICommentReplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论回复 服务实现类
 * </p>
 *
 * @author marth
 * @since 2022-04-11
 */
@Service
public class CommentReplyServiceImpl extends ServiceImpl<CommentReplyMapper, CommentReply> implements ICommentReplyService {

}
