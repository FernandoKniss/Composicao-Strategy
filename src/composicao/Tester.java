package composicao;

public class Tester {

	public static void main (String[] args) {
		
		CalculoDeConsumoEPedagio calculo = new CalculoDeConsumoEPedagio();
		Carro carro = new Carro(calculo);
		carro.quilometragemTotal(45);
		carro.gastoDeLitrosCombustivel(11);
		carro.valorTotalGastoCombustivel(3.5);
		carro.valorDePedagio(2);
		
		System.out.println("Ser� gasto " + carro.getLitrosCombustivel() + " litros de combust�vel.");
		System.out.println("Custar� " + carro.getValorTotal() + " em combustivel para viagem.");
		System.out.println("Ped�gio: " + carro.getPedagio());
		
		
		Motocicleta moto = new Motocicleta(calculo);
		moto.quilometragemTotal(45);
		moto.gastoDeLitrosCombustivel(15);
		moto.valorTotalGastoCombustivel(3.5);
		moto.valorDePedagio(2);
		
		System.out.println("Ser� gasto " + moto.getLitrosCombustivel() + " litros de combust�vel.");
		System.out.println("Custar� " + moto.getValorTotal() + " em combustivel para viagem.");
		System.out.println("Ped�gio: " + moto.getPedagio());
		
	}
	
}
