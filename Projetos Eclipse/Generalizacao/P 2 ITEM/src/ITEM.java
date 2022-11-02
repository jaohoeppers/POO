
public class ITEM {
	
	private int Codigo;
	private String Descriçao;
	
	public ITEM (int codigo) {
		setCodigo(codigo);
	}
	
	public void ITEM2 (String endereço) {
		setDescriçao(endereço);
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo2) {
		this.Codigo = codigo2;
	}

	public String getDescriçao() {
		return Descriçao;
	}

	public void setDescriçao(String endereço) {
		this.Descriçao = endereço;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ITEM [Codigo=");
		builder.append(Codigo);
		builder.append(", Descriçao=");
		builder.append(Descriçao);
		builder.append("]");
		return builder.toString();
	}
	

}
