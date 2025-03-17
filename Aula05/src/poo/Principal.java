package poo;

public class Principal {

	public static void main(String[] args) {
		
		//Gastos Janeiro
		Conta janeiro = new Conta();
		Conta fevereiro = new Conta();
		
		janeiro.agua = 300;
		janeiro.alimentacao = 1000;
		janeiro.luz = 300;
		
		//Gastos Fevereiro
		fevereiro.agua = 100;
		fevereiro.alimentacao = 800;
		fevereiro.luz = 300;
		
		//Somar gastos
		double gastoJan = janeiro.somaConta();
		double gastoFev = fevereiro.somaConta();
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de Janeiro foi maior que o de Fevereiro.");
		} 
		else if(gastoFev > gastoJan) {
			System.out.println("O gasto de Fevereiro foi maior que o de Janeiro.");
			
		}
		else {
			System.out.println("Ambos tiveram o mesmo gasto.");
		}
		
		

	}

}
