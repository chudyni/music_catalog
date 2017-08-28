package com.example.musiccatalog.controller;

import com.example.musiccatalog.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marcin.bracisiewicz
 */
@Controller
@RequestMapping("/band")
public class BandController {

    @Autowired
    private BandService bandService;

    @GetMapping("/list")
    public String list(final Model model) {
        model.addAttribute("bands", this.bandService.list());
        return "band/list";
    }

}
