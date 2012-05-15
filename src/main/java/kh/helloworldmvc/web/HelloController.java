package kh.helloworldmvc.web;

import kh.helloworldmvc.domain.HelloBean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Simple controller to illustrate @RequestMapping usage.
 * 
 * @author Kevin Hooke
 */
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
	public String helloPerson( @ModelAttribute("hello") HelloBean hello )
	{
	    //Explicit approach to adding a named bean into your Model
	    //Don't need this step here since we already bound the bean by mapping it in the params
	    //ModelAndView mv = new ModelAndView();
	    //mv.addObject("hello", hello);
	    //return mv;
	    
	    return "hello";
	}
	
	
}
