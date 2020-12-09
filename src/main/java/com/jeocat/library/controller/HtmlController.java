package com.jeocat.library.controller;

import com.jeocat.library.dao.entity.Classics;
import com.jeocat.library.service.ClassicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/page")
public class HtmlController {
    @Autowired
    ClassicsService classicsService;
    @GetMapping("/classics")
    public String showClassics (Model model) {
        model.addAttribute("classics", classicsService.findAll());
        return "classicsInventory";
    }
    @GetMapping("/storage")
    public String storageClassic (Model model) {
        Classics classics = new Classics();
        model.addAttribute("classics", classics);

        return "classicStorage";
    }
}
