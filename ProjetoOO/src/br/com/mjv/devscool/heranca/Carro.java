package br.com.mjv.devscool.heranca;

public class Carro extends Veiculo {
	@Override
	public String marca() {
		return "Uno";
	}
	
	public String rodas() {
		return super.rodas();
	}
	
}
