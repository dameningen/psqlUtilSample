package com.example.demo.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.resource.Response;
import com.example.demo.domain.model.Comment;
import com.example.demo.domain.service.CommentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/comment")
@Slf4j
public class CommentCountController {

    @Autowired
    private CommentService commentService;

    @GetMapping(value = "/getcount")
    public ResponseEntity<Response<List<Comment>>> getMtNoteCount() {

        Response<List<Comment>> response = new Response<>();
        List<Comment> subInfo = commentService.getCount();
        response.setData(subInfo);

        log.info("★response：" + response);

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/findall")
    public ResponseEntity<Response<List<Comment>>> findAllPayment() {

        Response<List<Comment>> response = new Response<>();
        List<Comment> subInfo = commentService.findAll();
        response.setData(subInfo);

        log.info("★response：" + response);

        return ResponseEntity.ok(response);
    }

}
