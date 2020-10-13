package br.com.mjv.devscool.interfaces;

public interface Cliente {
	default String nomeCliente(String nome) {
		return nome;	
	}
}
