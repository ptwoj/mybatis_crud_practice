package com.crud.board.service;

import com.crud.board.dto.BoardDto;
import com.crud.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDto boardDto){
        boardRepository.save(boardDto);
    }
}
