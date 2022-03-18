package com.dynamic.spring.mvc;

import java.time.LocalDateTime;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.annotation.*;


@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homeGet(Locale locale, @ModelAttribute("user") User user, Model _model) {
		//_model.addAttribute("msg","Index: Please enter your login details.");
		System.out.println("index page found, locale: "+locale);
		LocalDateTime date = LocalDateTime.now();
		_model.addAttribute("serverTime",date.toString());
		_model.addAttribute("newUser",user);
		return "home";
	}
	
	@ModelAttribute("User")
	public User initUser() {
		return new User();
	}

	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String userPost(@Validated User user, Model _model) {
		//_model.addAttribute("msg","Index: Please enter your login details.");
		System.out.println("User found, user: "+user.getUsername());
		LocalDateTime date = LocalDateTime.now();
		_model.addAttribute("userName",user.getUsername());
		return "user";
	}

}
