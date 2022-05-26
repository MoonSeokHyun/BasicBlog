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
        boardService.insert(board);
    }

    @GetMapping("/board/detail/{id}")
    public Board detail(@PathVariable Integer id){
        return boardService.boardView(id);
    }

    @GetMapping("/board/delete")
    public void delete(Integer id){
    boardService.delete(id);
        System.out.println("완료");
    }
    @PostMapping("/board/modify")
    public Integer modify(Board board){
        System.out.println(board.getId());
        System.out.println(board.getContent());
        return boardService.modify(board);
    }
    }

