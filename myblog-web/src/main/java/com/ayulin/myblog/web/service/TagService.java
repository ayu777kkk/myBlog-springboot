package com.ayulin.myblog.web.service;

import com.ayulin.myblog.common.utils.Response;

public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();
}
