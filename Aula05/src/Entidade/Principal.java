package Entidade;

public class Principal {

	public static void main(String[] args) {
		Carro civic = new Carro();
		
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.placa = "EOP-7921";
		civic.cor = "Preto";
		civic.ano = 2022;
		civic.exibirInfo();
		
		
		Carro kicks = new Carro();
		kicks.fabricante = "Nissan";
		kicks.modelo = "Kicks SV";
		kicks.placa = "CHR-4951";
		kicks.cor = "Preto";
		kicks.ano = 2023;
		kicks.exibirInfo();
		
		
		Carro hb20 = new Carro();
		hb20.fabricante = "Hyundai";
		hb20.modelo = "HB20 2023";
		hb20.placa = "FSD-6025";
		hb20.cor = "Branco";
		hb20.ano = 2023;
		hb20.exibirInfo();
		

	}

}
