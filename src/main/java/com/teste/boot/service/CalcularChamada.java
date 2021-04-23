package com.teste.boot.service;

import org.springframework.stereotype.Service;

import com.teste.boot.model.Chamada;

/*
 * Classe que fará as operações de calculo da chamada
 */

@Service
public class CalcularChamada {
		 
	 
	 public Chamada calcular(Chamada chamadaModel) {
		 /*
		
		 if(chamadaModel.TipoPlano.toString().equals("FaleMais30")) {
			 
			 return chamadaModel;
		 }
		 
		 else if(chamadaModel.TipoPlano.toString().equals("FaleMais60")) {
			 
			 return chamadaModel;
		 }
 
		 else if(chamadaModel.TipoPlano.toString().equals("FaleMais120")) {
	 
			 return chamadaModel;
		 }
		 else {
			 
		 
			 return chamadaModel;
		 
		 
	 }	*/
		 return chamadaModel;
	 }
}
