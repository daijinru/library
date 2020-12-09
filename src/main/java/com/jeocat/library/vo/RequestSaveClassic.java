package com.jeocat.library.vo;

import lombok.Data;

@Data
public class RequestSaveClassic {
    /**
     * 作者
     */
    private String author;
    /**
     * 书名
     */
    private String title;
    /**
     * 分类
     */
    private String category;
    /**
     * 出版年份
     */
    private String year;
}
