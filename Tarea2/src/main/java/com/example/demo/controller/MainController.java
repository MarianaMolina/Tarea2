package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/estudiante")
	public @ResponseBody String estudiante() {
		String info = "Mariana Molina | 00046146 | Ingenieria Informatica | 4° año" ;
		return info;
	}
	
	@RequestMapping("/dia")
	public @ResponseBody String dia(HttpServletRequest dato1, HttpServletRequest dato2, HttpServletRequest dato3) {

		Integer annio = Integer.parseInt(dato1.getParameter("annio"));
		/* mes String */
		String mes =dato2.getParameter("mes");
		Month m = Month.valueOf(mes);
		Integer fecha = Integer.parseInt(dato3.getParameter("fecha"));
		
		LocalDate Date = LocalDate.of(annio,m ,fecha);

		DayOfWeek DIA = DayOfWeek.from(Date); 
		
		return DIA.name();
	}
	
	
}
