package com.webMvc.springwemvc.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.webMvc.springwemvc.model.Jedi;
import com.webMvc.springwemvc.repository.jediReposytory;

@Controller
public class JediController {  	

	/*o srping pede para criar uma instacia do jediRepository para ser usado*/
	@Autowired
	private jediReposytory reposytory;
	
	@GetMapping("/jedi")
	public ModelAndView jedi() {
		
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");   //o nome da url vai ser jedi
        final Jedi luke = new Jedi("luke", "sky");
		modelAndView.addObject("allJedi", reposytory.getAllJedi()); //retorna o obejeto com nome e sobrenome	
		
		return modelAndView;  //jedi vai buscar o mesmo arquivo html
	}//jedi
	
	@GetMapping("/new-jedi")
	public ModelAndView newJedi() {
		
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("new-jedi"); 
		
		modelAndView.addObject("jedi", new Jedi());
		
		return  modelAndView;
	}
	
	@PostMapping("/jedi")
	public String creatJedi(@ModelAttribute Jedi jedi, RedirectAttributes redirectAttributes) {
		
		reposytory.add(jedi);   //pega um jedi para adicionar a lista
		
		redirectAttributes.addFlashAttribute("message","usuario cadastrado");
		return "redirect:jedi";  //redireciona para a tela jedi
	}
	
	
}
