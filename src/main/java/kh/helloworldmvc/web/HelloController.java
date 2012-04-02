package kh.helloworldmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	 @ModelAttribute("hello")
	 public HelloBean getHelloObject() {
	  return new HelloBean();
	 }
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public ModelAndView helloPerson( @ModelAttribute("hello") HelloBean hello, BindingResult result, Model model )
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("hello", hello);
		return mv;
	}
	
	
}
