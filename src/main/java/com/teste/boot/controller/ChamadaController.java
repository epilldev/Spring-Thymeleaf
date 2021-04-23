package com.teste.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teste.boot.model.Chamada;
import com.teste.boot.service.CalcularChamada;

/*
 * Classe que contém as chamadas das telas, e faz a intermediação
 */

@Controller
@RequestMapping("/chamadas")
public class ChamadaController {
	

	@Autowired
    private CalcularChamada service;
	
	@GetMapping("/calculo")
	public String cadastrar() {		
		return "/chamadas/calculo";
	}
	
	@GetMapping("/lista")
	public String listar() {		
		return "/chamadas/lista";
	}

	@PostMapping("/calcular")
    public String calcular(Chamada calculo){
		service.calcular(calculo);
        return "redirect: /chamadas/calculo";
	}
	
}

