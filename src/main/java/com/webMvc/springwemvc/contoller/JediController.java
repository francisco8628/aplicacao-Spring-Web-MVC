package com.webMvc.springwemvc.contoller;

import java.util.List;

import com.webMvc.springwemvc.model.Jedi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JediController {
   
	@GetMapping("/jedi")
	public ModelAndView jedi() {
		
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");   //o nome da url vai ser jedi
        final Jedi luke = new Jedi("luke", "sky");
		modelAndView.addObject("allJedi", List.of(luke));
		
		
		
		return modelAndView;  //jedi vai buscar o mesmo arquivo html
	}
	
	
}
