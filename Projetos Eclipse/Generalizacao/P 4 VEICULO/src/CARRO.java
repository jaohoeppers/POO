
public class CARRO extends VEICULO {

	public CARRO(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}
	
	private int portas;

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("CARRO [portas=");
		builder.append(portas);
		builder.append("]");
		return builder.toString();
	}
	
	

}
