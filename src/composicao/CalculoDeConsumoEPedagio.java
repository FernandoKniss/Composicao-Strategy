package composicao;

public class CalculoDeConsumoEPedagio {

	// atributos
	private double km, litrosCombustivel, valorTotal, pedagio;
	
	
	
	// get
	public double getKm() {
		return this.km;
	}
	
	public double getLitrosCombustivel() {
		return this.litrosCombustivel;
	}
		
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	public double getPedagio() {
		return this.pedagio;
	}
	
	
	public void quilometragemTotal (double quilometragem) {
		this.km= quilometragem *= 2; 
	}
	
	
	
	public void gastoDeLitrosCombustivel (double consumo) {
		this.litrosCombustivel = km /= consumo;
	}
	
	
	
	public void valorTotalGastoCombustivel (double precoCombustivel) {
		this.valorTotal = litrosCombustivel * precoCombustivel;
	}
	
	
	public void valorDePedagio (double valorPedagio) {
		this.pedagio = valorPedagio;
	}
	
}
