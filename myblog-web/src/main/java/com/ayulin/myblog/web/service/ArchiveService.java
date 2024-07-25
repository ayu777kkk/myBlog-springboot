package com.ayulin.myblog.web.service;

import com.ayulin.myblog.common.utils.Response;
import com.ayulin.myblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
