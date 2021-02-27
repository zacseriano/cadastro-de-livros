package com.cadastrows.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cadastrows.models.Usuario;
import com.cadastrows.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioRepository ur; 
	
	@RequestMapping(value="/cadastrarLogin", method=RequestMethod.GET)
	public String form() {
		return "user/formUsuario";
	}
	
	@RequestMapping(value="/cadastrarLogin", method=RequestMethod.POST)
	public String form(Usuario user){
		
		ur.save(user);
		
		return "redirect:/";
	}	
	
}
