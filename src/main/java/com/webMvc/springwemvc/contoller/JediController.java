package com.webMvc.springwemvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JediController {
   
	@GetMapping("/jedi")
	public String jedi() {
		
		return "jedi";  //jedi vai buscar o mesmo arquivo html
	}
	
}
