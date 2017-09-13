package strategy;


public class Agua extends Bebidas {

	@Override
	public double produtos(double quantidade, double preco) { 
		if (preco <= 5)
			return quantidade * preco; 
		return quantidade * preco -2;
	}

}
