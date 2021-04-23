package com.teste.boot.model;

/*
 * Classe que contém os atributos do objeto para ser instânciado e depois manipulado 
 */
public class Chamada {
	
	private String codigo_origem;
	private String codigo_destino;
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private double tempo = 0;
	private double valor = 0;
	
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

	public enum TipoPlano
    {
        FaleMais30,
        FaleMais60,
        FaleMais120
    }
	
}
