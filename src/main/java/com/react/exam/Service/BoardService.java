package com.react.exam.Service;

import com.react.exam.entity.Board;
import com.react.exam.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    //게시글 리스트 처리
    public List<Board> boardList() {

        return  boardRepository.findAll();
    }


}
