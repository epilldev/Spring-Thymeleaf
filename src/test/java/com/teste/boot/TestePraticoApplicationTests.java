package com.teste.boot;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.teste.boot.model.Chamada;
import com.teste.boot.service.CalcularChamadaService;

@RunWith(SpringRunner.class)
@SpringBootTest
class TestePraticoApplicationTests {

	@Autowired
	private CalcularChamadaService chamada;
	
	@Test
	public void calcularTestFaleMais30() {		
		Chamada objeto = new Chamada();
		objeto.setNome("Felipe");
		objeto.setCodigo_origem("011");
		objeto.setCodigo_destino("016");
		objeto.setTipo_plano("FaleMais30");
		objeto.setTempo(20);
		chamada.calcular(objeto);
		assertEquals("0.0",String.valueOf(objeto.getValor_plano()));
		assertEquals("38.0",  String.valueOf(objeto.getValor_normal()));
	}
	
	@Test
	public void calcularTestFaleMais60() {		
		Chamada objeto = new Chamada();
		objeto.setNome("Felipe");
		objeto.setCodigo_origem("011");
		objeto.setCodigo_destino("017");
		objeto.setTipo_plano("FaleMais60");
		objeto.setTempo(80);
		chamada.calcular(objeto);
		assertEquals("37.4",String.valueOf(objeto.getValor_plano()));
		assertEquals("136.0",  String.valueOf(objeto.getValor_normal()));
	}
	
	@Test
	public void calcularTestFaleMais120() {		
		Chamada objeto = new Chamada();
		objeto.setNome("Felipe");
		objeto.setCodigo_origem("018");
		objeto.setCodigo_destino("011");
		objeto.setTipo_plano("FaleMais120");
		objeto.setTempo(200);		
		chamada.calcular(objeto);
		assertEquals("167.2",String.valueOf(objeto.getValor_plano()));
		assertEquals("380.0",  String.valueOf(objeto.getValor_normal()));
	}

}
