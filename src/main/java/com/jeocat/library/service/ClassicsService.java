package com.jeocat.library.service;

import com.jeocat.library.dao.entity.Classics;
import com.jeocat.library.dao.mapper.ClassicsMapper;
import com.jeocat.library.vo.RequestSaveClassic;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassicsService {
    @Autowired
    ClassicsMapper classicsMapper;

    public int insert(RequestSaveClassic body) {
        Classics classics = new Classics();
        BeanUtils.copyProperties(body, classics);
        return classicsMapper.insert(classics);
    }

    public List<Classics> findByAuthor (String author) {
        return classicsMapper.selectByAuthor(author);
    }

    public List<Classics> findAll() {
        return classicsMapper.selectAll();
    }
}
