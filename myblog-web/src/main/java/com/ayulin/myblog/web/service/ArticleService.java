package com.ayulin.myblog.web.service;

import com.ayulin.myblog.common.utils.Response;
import com.ayulin.myblog.web.model.vo.article.FindArticleDetailReqVO;
import com.ayulin.myblog.web.model.vo.article.FindIndexArticlePageListReqVO;

public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);

    /**
     * 获取文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}
