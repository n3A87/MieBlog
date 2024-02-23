package com.mie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mie.domain.ResponseResult;
import com.mie.domain.entity.Article;
import com.mie.mapper.ArticleMapper;
import com.mie.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author 3A87
 * @date 2024/2/23
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Override
    public ResponseResult hotArticleList() {
        return null;
    }
}
