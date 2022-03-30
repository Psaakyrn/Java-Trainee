package com.spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.LoginBean;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView init(Model _model) {
		_model.addAttribute("msg","Please enter your login details.");
		return new ModelAndView("login", "loginBean", new LoginBean());
	}

	@RequestMapping("/")
	public String index(Model _model) {
		//_model.addAttribute("msg","Index: Please enter your login details.");
		return "index";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView submit(Model _model, @ModelAttribute("LoginBean") LoginBean loginBean) {
		if(loginBean!=null && loginBean.getUsername()!=null
				&& loginBean.getPassword()!=null) {
			if(loginBean.getUsername().equals("Admin")&&loginBean.getPassword().equals("rootPass")){
				_model.addAttribute("msg",loginBean.getUsername());
				return new ModelAndView("success", "", null);
			}
			else if(loginBean.getUsername().equals("")&&loginBean.getPassword().equals(""))
			{
				_model.addAttribute("error","please enter details");
				return new ModelAndView("login", "loginBean", new LoginBean());
			}
			else
			{
				_model.addAttribute("error","wrong username/password");
				return new ModelAndView("login", "loginBean", new LoginBean());
			}
		}
		_model.addAttribute("error","please enter details");
		return new ModelAndView("login", "loginBean", new LoginBean());
	}
	
}
