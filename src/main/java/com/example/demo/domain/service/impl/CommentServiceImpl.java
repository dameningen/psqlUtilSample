package com.example.demo.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.Comment;
import com.example.demo.domain.repository.CommentRepository;
import com.example.demo.domain.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> getCount() {
        return commentRepository.getDailyPaymentCount();
    }

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

}
