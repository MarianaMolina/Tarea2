package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/estudiante")
	public @ResponseBody String estudiante() {
		String info = "Mariana Molina | 00046146 | Ingenieria Informatica | 3° año" ;
		return info;
	}
	
	@RequestMapping("/fecha")
	public @ResponseBody String fecha (HttpServletRequest request) {
		
		return;
	}
}
