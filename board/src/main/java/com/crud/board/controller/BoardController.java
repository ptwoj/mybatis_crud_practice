package com.crud.board.controller;

import com.crud.board.dto.BoardDto;
import com.crud.board.dto.BoardFileDto;
import com.crud.board.repository.BoardRepository;
import com.crud.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/save")
    public String save(BoardDto boardDto) throws IOException {
        System.out.println("boardDto = " + boardDto);
        boardService.save(boardDto);
        return "redirect:/list";
    }

    @PostMapping("/update/{id}")
    public String update(BoardDto boardDto, Model model) {
        boardService.update(boardDto);
        BoardDto dto = boardService.findById(boardDto.getId());
        model.addAttribute("board", dto);
        return "detail";
    }

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<BoardDto> boardDtoList = boardService.findAll();
        model.addAttribute("boardList", boardDtoList);
        System.out.println("boardDto = " + boardDtoList);
        return "list";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        // 조회수 처리
        boardService.updateHits(id);
        
        // 상세내용 가져옴
        BoardDto boardDto = boardService.findById(id);
        model.addAttribute("board", boardDto);
        System.out.println("boardDto = " + boardDto);
        if (boardDto.getFileAttached() == 1){
            BoardFileDto boardFileDto = boardService.findFile(id);
            model.addAttribute("boardFile", boardFileDto);
        }
        return "detail";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        BoardDto boardDto = boardService.findById(id);
        model.addAttribute("board", boardDto);
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        boardService.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/paging")
    public String paging(Model model,
                         @RequestParam(value = "page", required = false, defaultValue = "1") int page) {

        List<BoardDto> pageingList = boardService.pagingList(page);
        return "index";


    }

}
