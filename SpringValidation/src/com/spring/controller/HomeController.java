package com.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.LoginInfo;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String viewHomePage(@ModelAttribute("userinfo") LoginInfo logininfo) {

		return "home-page";
	}

	@RequestMapping("/success")
	public String result(@Valid @ModelAttribute("userinfo") LoginInfo logininfo, BindingResult result) {
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		}

	

		return "result-page";
	}
}
