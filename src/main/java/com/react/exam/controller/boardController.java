package com.react.exam.controller;

import com.react.exam.Service.BoardService;
import com.react.exam.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class boardController {

    @Autowired
    private BoardService boardService;
    @GetMapping("/board/list")
    public List<Board> boardList(Model model){
        return boardService.boardList();
    }

    @PostMapping("/board/insert")
    public void boardinsert(Board board){
        System.out.println(board.getTitle());
        System.out.println(board.getContent());
        boardService.insert(board);
        System.out.println("완료");
    }
    }

