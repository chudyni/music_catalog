package com.example.musiccatalog.controller;

import com.example.musiccatalog.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @Secured("ADMIN_ROLE")
    @GetMapping("/{id}")
    public String getAlbum(@PathVariable long id, final Model model) {
        model.addAttribute("album", this.albumService.getAlbum(id));
        return "album/album";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/byBand/{bandName}")
    public String findByBandName(@PathVariable String bandName, final Model model) {
        model.addAttribute("albums", this.albumService.findByBandName(bandName));
        return "album/list";
    }

    @GetMapping("/byYear/{year}")
    public String findByYear(@PathVariable int year, final Model model) {
        model.addAttribute("albums", this.albumService.findByYear(year));
        return "album/list";
    }

    @GetMapping("/{bandName}/{year}")
    public String findByBandNameAndYear(@PathVariable String bandName, @PathVariable int year, final Model model) {
        model.addAttribute("album", this.albumService.findByBandNameAndYear(bandName, year));
        return "album/album";
    }
}
