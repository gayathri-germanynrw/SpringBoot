package com.webproject.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {

	@RequestMapping("home")
	public ModelAndView home(Person person) {

		ModelAndView mv = new ModelAndView();

		mv.addObject("obj", person);
		mv.setViewName("home");
		return mv;

	}

}
