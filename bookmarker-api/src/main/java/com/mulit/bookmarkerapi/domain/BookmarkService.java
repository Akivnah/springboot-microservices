package com.mulit.bookmarkerapi.domain;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;

    public List<Bookmark> getBookmarks(){
        return repository.findAll();
    }

}
