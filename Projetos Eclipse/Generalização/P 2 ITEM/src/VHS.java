
public class VHS extends MIDIA {

	public VHS(int codigo) {
		super(codigo);
		// TODO Auto-generated constructor stub
	}
	
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
