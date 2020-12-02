package com.fight.service;


import com.fight.entity.BlogComment;
import com.fight.utils.PageQueryUtil;
import com.fight.utils.PageResult;

public interface CommentService {

    /**
     * 添加评论
     * @param blogComment
     * @return
     */
    Boolean addComment(BlogComment blogComment);

    /**
     * 评论分页功能
     * @param pageQueryUtil
     * @return
     */
    PageResult getCommentsPage(PageQueryUtil pageQueryUtil);

    // 得到所有评论
    int getTotalComments();

    /**
     * 批量审核
     * @param ids
     * @return
     */
    Boolean checkDone(Integer[] ids);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 添加回复
     * @param commentId
     * @param replyBody
     * @return
     */
    Boolean reply(Long commentId, String replyBody);


    /**
     * 根据文章id和分页参数获取文章的评论列表
     * @param blogId
     * @param page
     * @return
     */
    PageResult getCommentPageByBlogIdAndPageNum(Long blogId, int page);


}
