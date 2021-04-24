package com.teste.boot.service;

import org.springframework.stereotype.Service;
import com.teste.boot.model.Chamada;
/*
 * Classe que fará as operações de calculo da chamada
 */

@Service
public class CalcularChamadaService {

	
	public Chamada calcular(Chamada chamadaModel) {

		if (chamadaModel.getTipo_plano().equals(Chamada.TipoPlano.FaleMais30.toString())) {
			chamadaModel.faleMais30(chamadaModel);
			chamadaModel.tarifaNormal(chamadaModel);
			return chamadaModel;
		}

		else if (chamadaModel.getTipo_plano().equals(Chamada.TipoPlano.FaleMais60.toString())) {
			chamadaModel.faleMais60(chamadaModel);
			chamadaModel.tarifaNormal(chamadaModel);
			return chamadaModel;
		}

		else if (chamadaModel.getTipo_plano().equals(Chamada.TipoPlano.FaleMais120.toString())) {
			chamadaModel.faleMais120(chamadaModel);
			chamadaModel.tarifaNormal(chamadaModel);
			return chamadaModel;
		} else {

			return chamadaModel;

		}
	}
}
