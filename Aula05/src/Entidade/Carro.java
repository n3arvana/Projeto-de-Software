package Entidade;

public class Carro {
	String fabricante;
	String modelo;
	int ano;
	String placa;
	String cor;



public void exibirInfo() {
	System.out.println(
			",  Fabricante:" + fabricante +
			",  Modelo: "  + modelo +
			",  Cor: " + cor +
			",  Ano: " + ano +
			",  Placa: " + placa);
}
	
}
