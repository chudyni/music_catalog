package com.example.musiccatalog.controller;

import com.example.musiccatalog.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marcin.bracisiewicz
 */
@Controller
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/list")
    public String list(final Model model) {
        model.addAttribute("albums", this.albumService.list());
        return "album/list";
    }

    @GetMapping("/{id}")
    public String getAlbum(@PathVariable long id, final Model model) {
        model.addAttribute("album", this.albumService.getAlbum(id));
        return "album/album";
    }
}
