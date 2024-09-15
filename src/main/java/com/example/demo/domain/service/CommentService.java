package com.example.demo.domain.service;

import java.util.List;

import com.example.demo.domain.model.Comment;

public interface CommentService {

    List<Comment> getCount();

    List<Comment> findAll();

}
