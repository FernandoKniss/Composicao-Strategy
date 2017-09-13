package strategy;

public class Refrigerante extends Bebidas{

	@Override
	public double produtos(double quantidade, double preco) {
		return quantidade * preco;
	}

	
	
}
