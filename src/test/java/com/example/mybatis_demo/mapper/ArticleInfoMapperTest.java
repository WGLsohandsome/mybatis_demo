package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.model.ArticleInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ArticleInfoMapperTest {
    @Autowired
    private ArticleInfoMapper articleInfoMapper;

    @Test
    void add() {
        ArticleInfo articleInfo = new ArticleInfo();
        articleInfo.setTitle("你好,mybatis");
        articleInfo.setContent("还不错");
        articleInfo.setUid(1);
        int result = articleInfoMapper.add(articleInfo);
        System.out.println("添加结果: "+result);
    }

    @Test
    void addGetId() {
        ArticleInfo articleInfo = new ArticleInfo();
        articleInfo.setTitle("你好,mybatis");
        articleInfo.setContent("很不错");
        articleInfo.setUid(3);
        int result = articleInfoMapper.addGetId(articleInfo);
        System.out.println("添加结果:" + result+"自增id: "+articleInfo.getId());
    }

    @Test
    void deleteById() {
        int res = articleInfoMapper.deleteById(4);
        System.out.println("删除结果: "+res);
    }

    @Test
    void updateTitle() {
        int result = articleInfoMapper.updateTitle(1,"太不错了");
        System.out.println(result);
    }
}