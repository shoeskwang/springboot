package com.example.demo.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.board.domain.BoardVO;
import com.example.demo.board.mapper.BoardMapper;

@Service("com.example.demo.board.service.BoardService")
public class BoardService {
	@Resource(name="com.example.demo.board.mapper.BoardMapper")
	BoardMapper boardMapper;
	
	public List<BoardVO> boardList() throws Exception{
		return boardMapper.boardList();
	}
}
