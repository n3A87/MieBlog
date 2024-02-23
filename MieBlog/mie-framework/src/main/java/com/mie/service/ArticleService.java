package com.mie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mie.domain.ResponseResult;
import com.mie.domain.entity.Article;

/**
 * @author 3A87
 * @date 2024/2/23
 */
public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();
}
