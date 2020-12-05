package com.jeocat.library.controller;

import com.jeocat.library.dao.entity.Classics;
import com.jeocat.library.service.ClassicsService;
import com.jeocat.library.vo.RequestSaveClassic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classics")
public class ClassicsController {
    @Autowired
    ClassicsService classicsService;

    @PostMapping("/save")
    public int saveClassic (@RequestBody RequestSaveClassic body) {
        return classicsService.insert(body);
    }

    @GetMapping("/author")
    public List<Classics> findByAuthor (@RequestParam String author) {
        return classicsService.findByAuthor(author);
    }
}
