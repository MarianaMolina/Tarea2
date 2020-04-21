package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

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
	
	@RequestMapping("/dia")
	public @ResponseBody String dia(HttpServletRequest dato1, HttpServletRequest dato2) {
		Integer fecha = Integer.parseInt(dato1.getParameter("fecha"));
		Integer annio = Integer.parseInt(dato2.getParameter("annio"));
		
		
		LocalDate localDate = LocalDate.of(annio, Month.APRIL, fecha);

		DayOfWeek DIA = DayOfWeek.from(localDate); 
		
		return DIA.name();
	}
	
	
}
