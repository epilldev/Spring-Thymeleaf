package com.teste.boot.service;

import org.springframework.stereotype.Service;

import com.teste.boot.model.Chamada;

/*
 * Classe que fará as operações de calculo da chamada
 */

@Service
public class CalcularChamada {

	
	public Chamada calcular(Chamada chamadaModel) {

		if (chamadaModel.getTipo_plano().equals(Chamada.TipoPlano.FaleMais30.toString())) {
			chamadaModel.faleMais30(chamadaModel);
			return null;
		}

		else if (chamadaModel.getTipo_plano().equals(Chamada.TipoPlano.FaleMais60.toString())) {

			return null;
		}

		else if (chamadaModel.getTipo_plano().equals(Chamada.TipoPlano.FaleMais120.toString())) {

			return null;
		} else {

			return chamadaModel;

		}
	}
}
