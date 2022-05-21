package com.react.exam.controller;

import com.react.exam.Service.BoardService;
import com.react.exam.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class boardController {

    @Autowired
    private BoardService boardService;
    @GetMapping("/board/list")
    public List<Board> boardList(Model model){
        return boardService.boardList();
    }
    }

