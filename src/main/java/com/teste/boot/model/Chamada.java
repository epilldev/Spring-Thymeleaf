package com.teste.boot.model;

/*
 * Classe que contém os atributos do objeto para ser instânciado e depois manipulado 
 */
public class Chamada {	

	protected String codigo_origem;
	protected String codigo_destino;
	private String nome;
	protected double tempo = 0;
	protected double tarifa = 0;
	protected double valor_plano = 0;
	protected double valor_normal = 0;
	private String tipo_plano;
	
	
	
	

	public String getCodigo_origem() {
		return codigo_origem;
	}

	public void setCodigo_origem(String codigo_origem) {
		this.codigo_origem = codigo_origem;
	}

	public String getCodigo_destino() {
		return codigo_destino;
	}

	public void setCodigo_destino(String codigo_destino) {
		this.codigo_destino = codigo_destino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getValor_plano() {
		return valor_plano;
	}

	public void setValor_plano(double valor_plano) {
		this.valor_plano = valor_plano;
	}

	public double getValor_normal() {
		return valor_normal;
	}

	public void setValor_normal(double valor_normal) {
		this.valor_normal = valor_normal;
	}

	public String getTipo_plano() {
		return tipo_plano;
	}

	public void setTipo_plano(String tipo_plano) {
		this.tipo_plano = tipo_plano;
	}
	
	

	public Chamada faleMais30(Chamada object) {

		if (object.tempo > 30) {
			object.tarifa = object.cota(object)*1.1;
			object.valor_plano = object.tarifa * (object.tempo - 30);
			return object;
		}
		return object;
	}

	public Chamada faleMais60(Chamada object) {

		if (object.tempo > 60) {
			object.tarifa = object.cota(object)*1.1;
			object.valor_plano = object.tarifa * (object.tempo - 60);
			return object;
		}
		return object;
	}

	public Chamada faleMais120(Chamada object) {

		if (object.tempo > 120) {
			object.tarifa = object.cota(object)*1.1;
			object.valor_plano = object.tarifa * (object.tempo - 120);
			return object;
		}
		return object;
	}
	public Chamada tarifaNormal(Chamada object) {
		object.valor_normal = object.cota(object);
		object.valor_normal = object.valor_normal * object.tempo;
		return object;
	}

	
	public double cota(Chamada object) {
		if (object.getCodigo_origem().equals("011") && object.getCodigo_destino().equals("016")) {
			return object.tarifa = 1.90;
		} else if (object.getCodigo_origem().equals("011") && object.getCodigo_destino().equals("017")) {
			return object.tarifa  = 1.70;
		} else if (object.getCodigo_origem().equals("016") && object.getCodigo_destino().equals("011")) {
			return object.tarifa  = 2.90;
		} else if (object.getCodigo_origem().equals("017") && object.getCodigo_destino().equals("011")) {
			return object.tarifa  = 2.70;
		} else if (object.getCodigo_origem().equals("011") && object.getCodigo_destino().equals("018")) {
			return object.tarifa  = 0.90;
		} else if (object.getCodigo_origem().equals("018") && object.getCodigo_destino().equals("011")) {
			return object.tarifa  = 1.90;
		} else {
			return object.tarifa  = 0;
		}
	}

	public enum TipoPlano {
		FaleMais30, FaleMais60, FaleMais120
	}

}
