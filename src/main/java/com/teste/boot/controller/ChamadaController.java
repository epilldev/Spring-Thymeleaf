package com.teste.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teste.boot.model.Chamada;
import com.teste.boot.service.CalcularChamadaService;

/*
 * Classe que contém as chamadas das telas, e faz a intermediação
 */

@Controller
@RequestMapping("/chamadas")
public class ChamadaController {
	
	Chamada chamada = new Chamada();
	@Autowired
    private CalcularChamadaService service;
	
	@GetMapping("/calculo")
	public String cadastrar() {		
		return "/chamadas/calculo";
	}
	
	@GetMapping("/lista")
	public String listar() {		
		return "/chamadas/lista";
	}
	
	@RequestMapping("/calcular")
    public String getResultado(Model model){
        model.addAttribute("chamada",chamada);
        return "calculator";
    }

	@PostMapping("/calcular")
    public String calcular(Model model,Chamada calculo){
		Chamada resultado = service.calcular(calculo);
		model.addAttribute("resultado",resultado);
        return "/chamadas/calculo";
	}
	
	
}

