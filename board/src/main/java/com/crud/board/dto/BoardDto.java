package com.crud.board.dto;

import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Timestamp;

@Getter
@ToString
public class BoardDto {
    private Long id;
    private String userName;
    private String title;
    private String category;
    private String content;
    private Timestamp crateAt;


    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCrateAt(Timestamp crateAt) {
        this.crateAt = crateAt;
    }
}
