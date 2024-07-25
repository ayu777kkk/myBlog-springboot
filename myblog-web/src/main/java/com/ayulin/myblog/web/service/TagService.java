package com.ayulin.myblog.web.service;

import com.ayulin.myblog.common.utils.Response;
import com.ayulin.myblog.web.model.vo.tag.FindTagArticlePageListReqVO;

public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);

}
