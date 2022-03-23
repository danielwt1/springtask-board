package com.example.tasktable.controller;

import com.example.tasktable.DTO.BoardDTO;
import com.example.tasktable.models.Board;
import com.example.tasktable.service.BoardService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Board")
public class BoardCtrl {
    private BoardService boardService;
    public BoardCtrl(BoardService boardService){
        this.boardService=boardService;
    }
    @PostMapping("/createBoard")
    public ResponseEntity<BoardDTO>createBoard(@RequestBody BoardDTO boardDTO){

       return new ResponseEntity<>(this.boardService.createBoard(boardDTO), HttpStatus.CREATED);

    }
    @PutMapping("/updateBoard/{boardId}")
    public ResponseEntity<BoardDTO>updateBoard(@PathVariable (value = "boardId")long boardId,
                                               @RequestBody BoardDTO boardDTO){
        BoardDTO boardDTOResponse=this.boardService.updateBoard(boardId,boardDTO);
        return new ResponseEntity<>(boardDTOResponse,HttpStatus.OK);
    }
    @GetMapping("/ListarBoards")
    public List<Board>findAll(){
        return this.boardService.findAll();
    }





}
