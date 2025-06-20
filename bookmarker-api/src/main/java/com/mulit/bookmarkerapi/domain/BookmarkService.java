package com.mulit.bookmarkerapi.domain;

import jakarta.transaction.Transactional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;

    public List<Bookmark> getBookmarks() {
        return repository.findAll();
    }
}
