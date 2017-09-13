package strategy;

public class Tester {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		
		Bebidas b = new Cerveja();
		Bebidas b1 = new Refrigerante();
		Bebidas b2 = new Agua();


		System.out.println(p.produtos(b,  5, 4.5));
		System.out.println(p.produtos(b1, 2, 4));
		System.out.println(p.produtos(b2, 2, 6));

	}

}
