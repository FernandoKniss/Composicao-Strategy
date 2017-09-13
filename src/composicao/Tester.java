package composicao;

public class Tester {

	public static void main (String[] args) {
		
		CalculoDeConsumoEPedagio calculo = new CalculoDeConsumoEPedagio();
		Carro carro = new Carro(calculo);
		carro.quilometragemTotal(45);
		carro.gastoDeLitrosCombustivel(11);
		carro.valorTotalGastoCombustivel(3.5);
		carro.valorDePedagio(2);
		
		System.out.println("Será gasto " + carro.getLitrosCombustivel() + " litros de combustível.");
		System.out.println("Custará " + carro.getValorTotal() + " em combustivel para viagem.");
		System.out.println("Pedágio: " + carro.getPedagio());
		
		
		Motocicleta moto = new Motocicleta(calculo);
		moto.quilometragemTotal(45);
		moto.gastoDeLitrosCombustivel(15);
		moto.valorTotalGastoCombustivel(3.5);
		moto.valorDePedagio(2);
		
		System.out.println("Será gasto " + moto.getLitrosCombustivel() + " litros de combustível.");
		System.out.println("Custará " + moto.getValorTotal() + " em combustivel para viagem.");
		System.out.println("Pedágio: " + moto.getPedagio());
		
	}
	
}
