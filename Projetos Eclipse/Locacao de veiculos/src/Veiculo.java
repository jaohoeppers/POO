
public class Veiculo {
	
	private String modelo;
	private double taxa;
	private int locacoes;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public int getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(int locacoes) {
		this.locacoes = locacoes;
	}
	
	public String addveiculo(String modelo, double taxa) {
		this.locacoes=0;
		return("Veiculo adicionado.");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [modelo=");
		builder.append(modelo);
		builder.append(", taxa=");
		builder.append(taxa);
		builder.append(", locacoes=");
		builder.append(locacoes);
		builder.append("]");
		return builder.toString();
	}

}
