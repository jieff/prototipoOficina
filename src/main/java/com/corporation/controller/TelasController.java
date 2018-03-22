package com.corporation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelasController {
	
	@GetMapping("/clientes")
	public String cadClientes() {
		
		return "clientes";
		
	}
	
	@GetMapping("/pedidos")
	public String pedidos() {
		
		return "pedidos";
		
	}

	
	@GetMapping("/index")
	public String index() {
		
		return "index";
		
	}
	
	@GetMapping("/index2")
	public String index2() {
		
		return "index2";
		
	}
	
	@GetMapping("/apoio")
	public String apoio() {
		
		return "apoio";
		
	}

}
