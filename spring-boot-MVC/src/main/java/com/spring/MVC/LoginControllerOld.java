package com.spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.bean.LoginBean;

@Controller
public class LoginControllerOld {
	/*
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String init(Model _model) {
		_model.addAttribute("msg","Please enter your login details.");
		return "login.jsp";
	}

	@RequestMapping("/")
	public String index(Model _model) {
		_model.addAttribute("msg","Index: Please enter your login details.");
		return "login";
	}

@RequestMapping(value="/login", method=RequestMethod.POST)
	public String submit(Model _model, @ModelAttribute("LoginBean") LoginBean loginBean) {
		if(loginBean!=null && loginBean.getUserName()!=null
				&& loginBean.getPassword()!=null) {
			if(loginBean.getUserName().equals("Admin")&&loginBean.getPassword().equals("rootPass")){
				_model.addAttribute("msg",loginBean.getUserName());
				return "success.jsp";
			}
			else
			{
				_model.addAttribute("error","wrong username/password");
				return "login.jsp";
			}
		}
		_model.addAttribute("error","please enter details");
		return "login.jsp";
	}
	*/
}
