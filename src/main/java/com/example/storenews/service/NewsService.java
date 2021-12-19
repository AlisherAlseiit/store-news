package com.example.storenews.service;

import com.example.storenews.model.News;
import com.example.storenews.model.NewsList;
import com.example.storenews.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewsService {

    @Autowired
    private NewsRepository repository;


    public Optional<News> getNews(Long id) {
        return repository.findById(id);
    }

    public NewsList getNewsList() {
       NewsList newsList = new NewsList();
       newsList.setNewsList(repository.findAll());

         return newsList;



    }


}
