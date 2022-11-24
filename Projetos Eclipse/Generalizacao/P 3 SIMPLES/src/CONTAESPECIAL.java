
public class CONTAESPECIAL extends CONTA {
	
	public CONTAESPECIAL(String banco) {
		super(banco);
		// TODO Auto-generated constructor stub
	}

	private int diassemjuros;
	private double limite;
	
	public int getDiassemjuros() {
		return diassemjuros;
	}
	public void setDiassemjuros(int diassemjuros) {
		this.diassemjuros = diassemjuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("CONTAESPECIAL [diassemjuros=");
		builder.append(diassemjuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}
	
	
}
