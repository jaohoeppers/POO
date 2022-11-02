
public class MIDIA extends ITEM {

	public MIDIA(int codigo) {
		super(codigo);
		// TODO Auto-generated constructor stub
	}
	
	private String gravadora;
	private float duração;
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public float getDuração() {
		return duração;
	}
	public void setDuração(float duração) {
		this.duração = duração;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("MIDIA [gravadora=");
		builder.append(gravadora);
		builder.append(", duração=");
		builder.append(duração);
		builder.append("]");
		return builder.toString();
	}
	
	

}
