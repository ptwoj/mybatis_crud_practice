package com.crud.board.controller;

import com.crud.board.repository.BoardRepository;
import com.crud.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
    @GetMapping("/save")
    public String save() {
        return "save";
    }
}
