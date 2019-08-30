package com.example.demo.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.board.domain.BoardVO;

@Repository("com.example.demo.board.mapper.BoardMapper")
public interface BoardMapper {
	public int boardCount() throws Exception;
	public List<BoardVO> boardList() throws Exception;
}
