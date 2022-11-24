
public class MOTO extends VEICULO {

	public MOTO(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}
	
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("MOTO [cilindradas=");
		builder.append(cilindradas);
		builder.append("]");
		return builder.toString();
	}
	
	

}
