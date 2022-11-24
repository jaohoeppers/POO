package atendimentomedico;

import java.util.Date;

public class pessoa {
	
	private Date datanasc;
	private String nome;
	
	public Date getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calcualaridade() {
	return 0 ;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [datanasc=");
		builder.append(datanasc);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
