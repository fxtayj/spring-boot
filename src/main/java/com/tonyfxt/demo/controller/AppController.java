package com.tonyfxt.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class AppController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index(HttpServletRequest request) {
		return "hello world!";
	}
	
	@RequestMapping("/err")
	@ResponseBody
	public String test(HttpServletRequest request) {
		return "error";
	}
}