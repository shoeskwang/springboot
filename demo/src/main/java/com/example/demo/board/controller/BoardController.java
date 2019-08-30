package com.example.demo.board.controller;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.board.service.BoardService;

@Controller
public class BoardController {
	@Resource(name="com.example.demo.board.service.BoardService")
	BoardService boardService;
	
	@RequestMapping("/list")
	public ModelAndView boardList() throws Exception{
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("list", boardService.boardList());
		
		return mav;
	}
}
