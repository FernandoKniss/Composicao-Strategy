package strategy;

public class Cerveja extends Bebidas {

	@Override
	public double produtos(double quantidade, double preco) { 
		if (quantidade >= 5)	
			return quantidade * preco - 5;
		return quantidade * preco;
	}

}

