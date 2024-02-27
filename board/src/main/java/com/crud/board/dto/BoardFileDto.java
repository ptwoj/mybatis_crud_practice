package com.crud.board.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BoardFileDto {
    private Long id;
    private Long boardId;

    // 사용자가 올린 원본 파일
    private String originalFileName;
    // 저장을 위한 파일 이름
    private String storedFileName;

    public void setId(Long id) {
        this.id = id;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public void setStoredFileName(String storedFileName) {
        this.storedFileName = storedFileName;
    }



}
