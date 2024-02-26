package com.crud.board.repository;

import com.crud.board.dto.BoardDto;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sql;
    public void save (BoardDto boardDto) {
        sql.insert("Board.save", boardDto);
    }
}
