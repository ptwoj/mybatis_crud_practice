package com.crud.board.dto;

import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;


import java.sql.Timestamp;
import java.util.List;

@Getter
@ToString
public class BoardDto {
    private Long id;
    private String userName;
    private String boardPass;
    private String title;
    private String category;
    private String content;
    private int boardHits;
    private String createdAt;
    
    // 게시글 파일 첨부 파일 유무 확인 필드
    private int fileAttached;
    // 게시글 작성 할 때 파일을 자체를 담기위한 필드
    private MultipartFile boardFile;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBoardPass(String boardPass) {
        this.boardPass = boardPass;
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

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setFileAttached(int fileAttached) {
        this.fileAttached = fileAttached;
    }

    public void setBoardFile(MultipartFile boardFile) {
        this.boardFile = boardFile;
    }
}
