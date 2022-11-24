
public class Pessoa01 {

	private String nome;
	private String sobre;
	
	
	
	//contrutor/
	public Pessoa01() {
	
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("funçao_ex_01 [nome=");
		builder.append(nome);
		builder.append(", sobre=");
		builder.append(sobre);
		builder.append("]");
		return builder.toString();	
	}
	
	public String nomecomp() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(" ");
		builder.append(sobre);
		return builder.toString();	
	}
	

	
	
	
}
