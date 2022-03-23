package com.example.tasktable.service;


import com.example.tasktable.DTO.BoardDTO;
import com.example.tasktable.models.Board;

import java.util.List;

public interface BoardService {
    public List<Board> findAll();
    public BoardDTO updateBoard(long boardId,BoardDTO boardDTO);
    public BoardDTO createBoard(BoardDTO boardDTO);
}
