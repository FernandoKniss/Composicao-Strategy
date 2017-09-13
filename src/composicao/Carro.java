package composicao;

public class Carro {

	private CalculoDeConsumoEPedagio calculoDeConsumoEPedagio;
	
	public Carro (CalculoDeConsumoEPedagio calculoDeConsumoEPedagio) {
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
		calculoDeConsumoEPedagio.quilometragemTotal(quilometragem);
	}
	
	
	
	public void gastoDeLitrosCombustivel(double consumo) {
		calculoDeConsumoEPedagio.gastoDeLitrosCombustivel(consumo);
	}
	
	
	
	public void valorTotalGastoCombustivel(double precoCombustivel) {
		calculoDeConsumoEPedagio.valorTotalGastoCombustivel(precoCombustivel);
	}
	
	
	public void valorDePedagio (double valorPedagio) {
		valorPedagio *= 2;
		calculoDeConsumoEPedagio.valorDePedagio(valorPedagio);
	}
	
}
