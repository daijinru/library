package com.jeocat.library.dao.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Classics implements Serializable {
    private Integer id;

    private String author;

    private String title;

    private String category;

    private short year;

    private short pages;

    private static final long serialVersionUID = 1L;
}