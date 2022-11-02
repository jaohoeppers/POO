
public class BOMBA {
	
	private double totaldelitros;
	private float valorlitro;
	boolean simnao;
	double valor;
	double litros;
	
	
	public BOMBA (double total,float valor) {
		setTotaldelitros(total);
		setValorlitro(valor);
	}
	
	public boolean abastecerporlitro(int litros) {
		totaldelitros=--litros;
		valor=valorlitro*litros;
		
		return simnao;
	}
	
	public boolean abastecerporvalor(double valor) {
		litros=valor/valorlitro;
		totaldelitros=--litros;
		
		return simnao;
	}

	public double getTotaldelitros() {
		return totaldelitros;
	}

	public void setTotaldelitros(double totaldelitros) {
		this.totaldelitros = totaldelitros;
	}

	public float getValorlitro() {
		return valorlitro;
	}

	public void setValorlitro(float valorlitro) {
		this.valorlitro = valorlitro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BOMBA [totaldelitros=");
		builder.append(totaldelitros);
		builder.append(", valorlitro=");
		builder.append(valorlitro);
		builder.append(", simnao=");
		builder.append(simnao);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", litros=");
		builder.append(litros);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
