package com.teste.boot.model;

/*
 * Classe que contém os atributos do objeto para ser instânciado e depois manipulado 
 */
public class Chamada {

	protected String codigo_origem;
	protected String codigo_destino;
	private String nome;
	protected double tempo = 0;
	protected double valor = 0;
	private String tipo_plano;

	public String getTipo_plano() {
		return tipo_plano;
	}

	public void setTipo_plano(String tipo_plano) {
		this.tipo_plano = tipo_plano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Chamada faleMais30(Chamada object) {

		if (object.tempo < 30) {
			object.valor = 0;
			return object;
		} else {
			object.valor = object.cota(object);
			return object;
		}
	}

	public Chamada faleMais60(Chamada object) {

		if (object.tempo < 60) {
			object.valor = 0;
			return object;
		} else {
			object.valor = object.cota(object);
			return object;
		}
	}

	public Chamada faleMais120(Chamada object) {

		if (object.tempo < 120) {
			object.valor = 0;
			return object;
		} else {
			object.valor = object.cota(object);
			return object;
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

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

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	
	public double cota(Chamada object) {
		if (object.getCodigo_origem().equals("011") && object.getCodigo_destino().equals("016")) {
			return object.valor = 1.90;
		} else if (object.getCodigo_origem().equals("011") && object.getCodigo_destino().equals("017")) {
			return object.valor  = 1.70;
		} else if (object.getCodigo_origem().equals("016") && object.getCodigo_destino().equals("011")) {
			return object.valor  = 2.90;
		} else if (object.getCodigo_origem().equals("017") && object.getCodigo_destino().equals("011")) {
			return object.valor  = 2.70;
		} else if (object.getCodigo_origem().equals("011") && object.getCodigo_destino().equals("018")) {
			return object.valor  = 0.90;
		} else if (object.getCodigo_origem().equals("018") && object.getCodigo_destino().equals("011")) {
			return object.valor  = 1.90;
		} else {
			return object.valor  = 0;
		}
	}

	public enum TipoPlano {
		FaleMais30, FaleMais60, FaleMais120
	}

}
