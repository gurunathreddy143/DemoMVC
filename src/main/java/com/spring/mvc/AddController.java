package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	/*@RequestMapping("/add")
	public ModelAndView adding(@RequestParam("t1") int i, @RequestParam("t2") int j ) {
		
		AddService ser= new AddService();
		
		int k = ser.add(i,j);
		
		ModelAndView mv= new ModelAndView();
		
		mv.setViewName("Display");
		mv.addObject("result", k);
		
	//return "Display";
		return mv;*/
	
	@RequestMapping("/validate")
	public ModelAndView display(@RequestParam("username") String str1,@RequestParam("password") String str2) {
		
		
		ModelAndView mv = new ModelAndView();
		if(str2.equals("admin")) {
		String msg ="Hello "+str1;
		mv.setViewName("Display");
		mv.addObject("message", msg);		
		return mv;
			
		}	else {
			String msg ="Sorry "+ str1 +". You entered an incorrect password";
			mv.addObject("message", msg);
			mv.setViewName("Display");
			return mv;
		}
		
		
		
	}
	
	/*
	 * @RequestMapping("/hello2") public String display() { return "final"; }
	 */
}
