
public class LIVRO extends ITEM {

	public LIVRO(int codigo) {
		super(codigo);
		// TODO Auto-generated constructor stub
	}
	
	private String autor;
	
	public void LIVRO2(String autor) {
		setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("LIVRO [autor=");
		builder.append(autor);
		builder.append("]");
		return builder.toString();
	}
	
	

	
}
