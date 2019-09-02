package com.example.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.member.mapper.MemberMapper;

@Controller
public class JspTestController {
	
	@Resource(name="com.example.demo.member.mapper.MemberMapper")
	MemberMapper memberMapper;
	
	@RequestMapping("/test")
	private ModelAndView jspTest() throws Exception {
		
		ModelAndView mav = new ModelAndView("test");
		
		return mav;
	}
}
