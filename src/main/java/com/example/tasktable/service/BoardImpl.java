package com.example.tasktable.service;


import com.example.tasktable.DTO.BoardDTO;
import com.example.tasktable.exception.ResourceNotFoundException;
import com.example.tasktable.models.Board;
import com.example.tasktable.repository.BoardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import java.util.List;

@Service
public class BoardImpl implements BoardService{

    private BoardRepository boardRepository;
    private ModelMapper modelMapper;
    public BoardImpl(BoardRepository boardRepository, ModelMapper modelMapper){
        this.boardRepository=boardRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public List<Board> findAll() {
        return this.boardRepository.findAll();
    }

    @Override
    public BoardDTO updateBoard(long boardId, BoardDTO boardDTO) {
        Board board=this.boardRepository.findById(boardId).orElseThrow(()->new ResourceNotFoundException("Board","Id",boardId));
        board.setNombre(boardDTO.getNombre());
        Board boardActualizada=this.boardRepository.save(board);
        return mapToDTO(boardActualizada);
    }

    @Override
    public BoardDTO createBoard(BoardDTO boardDTO) {
        Board board=mapToEntidad(boardDTO);
        Board nuevaBoard=this.boardRepository.save(board);
        BoardDTO boardResponse=mapToDTO(nuevaBoard);
        return boardResponse;
    }

    public BoardDTO mapToDTO(Board board){
        BoardDTO boardDTO=this.modelMapper.map(board,BoardDTO.class);
        return boardDTO;
    }
    public Board mapToEntidad(BoardDTO boardDTO){
        Board board=this.modelMapper.map(boardDTO,Board.class);
        return board;
    }
}
