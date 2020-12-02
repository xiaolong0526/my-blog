package com.fight.service.impl;

import com.fight.dao.BlogCommentMapper;
import com.fight.entity.BlogComment;
import com.fight.service.CommentService;
import com.fight.utils.PageQueryUtil;
import com.fight.utils.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private BlogCommentMapper blogCommentMapper;

    /**
     * 添加评论
     * @param blogComment
     * @return
     */
    @Override
    public Boolean addComment(BlogComment blogComment) {
        // 这里注意
        return blogCommentMapper.insertSelective(blogComment) > 0;
    }

    /**
     *
     * @param pageQueryUtil
     * @return
     */
    @Override
    public PageResult getCommentsPage(PageQueryUtil pageQueryUtil) {
        List<BlogComment> comments = blogCommentMapper.findBlogCommentList(pageQueryUtil);
        int total = blogCommentMapper.getTotalBlogComments(pageQueryUtil);
        return new PageResult(comments, total, pageQueryUtil.getLimit(), pageQueryUtil.getPage());
    }

    @Override
    public int getTotalComments() {
        // 这里为什么传null
        return blogCommentMapper.getTotalBlogComments(null);
    }

    @Override
    public Boolean checkDone(Integer[] ids) {
        return blogCommentMapper.checkDone(ids) > 0;
    }

    @Override
    public Boolean deleteBatch(Integer[] ids) {
        return blogCommentMapper.deleteBatch(ids) > 0   ;
    }

    @Override
    public Boolean reply(Long commentId, String replyBody) {
        BlogComment blogComment = blogCommentMapper.selectByPrimaryKey(commentId);
        if (blogComment != null && blogComment.getCommentStatus().intValue() == 1) {
            blogComment.setReplyBody(replyBody);
            blogComment.setReplyCreateTime(new Date());
            return blogCommentMapper.updateByPrimaryKeySelective(blogComment) > 0;
        }
        return false;
    }

    @Override
    public PageResult getCommentPageByBlogIdAndPageNum(Long blogId, int page) {
        if (page < 1) {
            return null;
        }
        Map<String, Object> params = new HashMap<>();
        params.put("page", page);
        //每页8条
        params.put("limit", 8);
        params.put("blogId", blogId);
        params.put("commentStatus", 1);//过滤审核通过的数据
        PageQueryUtil pageUtil = new PageQueryUtil(params);
        List<BlogComment> comments = blogCommentMapper.findBlogCommentList(pageUtil);
        if (!CollectionUtils.isEmpty(comments)) {
            int total = blogCommentMapper.getTotalBlogComments(pageUtil);
            return new PageResult(comments, total, pageUtil.getLimit(), pageUtil.getPage());
        }
        return null;
    }
}
