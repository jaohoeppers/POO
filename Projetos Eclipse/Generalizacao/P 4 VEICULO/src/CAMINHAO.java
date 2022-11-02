
public class CAMINHAO extends VEICULO {

	public CAMINHAO(boolean motor) {
		super(motor);
		// TODO Auto-generated constructor stub
	}
	
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("CAMINHAO [eixos=");
		builder.append(eixos);
		builder.append("]");
		return builder.toString();
	}
	
	

}
