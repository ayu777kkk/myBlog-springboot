package com.ayulin.myblog.web.service;

import com.ayulin.myblog.common.utils.Response;

public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();
}
