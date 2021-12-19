package com.example.storenews.controller;

import com.example.storenews.model.News;
import com.example.storenews.model.NewsList;
import com.example.storenews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/news")
public class StoreNewsController {

    @Autowired
    private NewsService service;


    @GetMapping("/{id}")
    private Optional<News> getNews(@PathVariable("id") Long id) {
        return service.getNews(id);
    }

    @GetMapping
    private NewsList getNewsList() {
        return  service.getNewsList();
    }
}
