package composicao;

public class Motocicleta {

	private CalculoDeConsumoEPedagio calculoDeConsumoEPedagio;
	
	public Motocicleta (CalculoDeConsumoEPedagio calculoDeConsumoEPedagio) {
		this.calculoDeConsumoEPedagio = calculoDeConsumoEPedagio;	
	}
	
	
	
	public double getLitrosCombustivel() {
		return calculoDeConsumoEPedagio.getLitrosCombustivel();
	}
	
	
	public double getValorTotal() {
		return calculoDeConsumoEPedagio.getValorTotal();
	}
	
	
	public double getPedagio() {
		return calculoDeConsumoEPedagio.getPedagio();
	}
	
	
	
	public void quilometragemTotal(double quilometragem) {
		calculoDeConsumoEPedagio.quilometragemTotal(quilometragem);;
	}
	
	
	
	public void gastoDeLitrosCombustivel(double consumo) {
		calculoDeConsumoEPedagio.gastoDeLitrosCombustivel(consumo);
	}
	
	
	
	public void valorTotalGastoCombustivel(double precoCombustivel) {
		calculoDeConsumoEPedagio.valorTotalGastoCombustivel(precoCombustivel);
	}
	


	
	public void valorDePedagio (double valorPedagio) {
		calculoDeConsumoEPedagio.valorDePedagio(valorPedagio);
	}
	
}
