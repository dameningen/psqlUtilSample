package com.example.demo.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private long commentId;
    private String comment;
    private boolean isActive;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    // TODO 集計結果（SQLで集計したcount）
    private long allComment;
    private long mtComment;
    private double mtCommentPer;
    private long aiComment;
    private double aiCommentPer;
    private Date date;
}
