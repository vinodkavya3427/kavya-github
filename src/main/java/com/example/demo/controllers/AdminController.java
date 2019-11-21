package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.StudentBean;

@Controller
public class AdminController {

	@GetMapping("/")
	public String showHomePage(HttpServletRequest req, HttpServletResponse res) {
		 //HttpSession session=req.getSession();
		//session.getAttribte("name","nimisha");
		return "index";
	}
	@PostMapping("/insert")
	public String showSuccessPage(StudentBean studentBean, Model model) {
		model.addAttribute("s", studentBean);
		return "insert";
	}
}
