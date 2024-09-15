package com.example.demo.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.model.Comment;

@Mapper
public interface CommentMapper {

    // TODO 集計用SQLを実行するメソッドを定義する
    List<Comment> getDailyCommentCount();

    // 全件抽出
    List<Comment> findAll();

}
