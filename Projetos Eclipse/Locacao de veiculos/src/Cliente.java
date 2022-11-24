
public class Cliente {
	
	private String nome;
	private String email;
	private boolean ativo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public Cliente(String nome, String email, boolean ativo) {
		this.nome=nome;
		this.email=email;
		this.ativo=ativo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", ativo=");
		builder.append(ativo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
