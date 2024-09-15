package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.mapper.CommentMapper;
import com.example.demo.domain.model.Comment;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

    private final CommentMapper commentMapper;

    public List<Comment> getDailyPaymentCount() {
        return commentMapper.getDailyCommentCount();
    }

    public List<Comment> findAll() {
        return commentMapper.findAll();
    }

}
