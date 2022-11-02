
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String endereço;

	public PessoaJuridica(String nome) {
		super(nome);
	}
	
	public void Pessoa (String cnpj) {
		setCnpj(cnpj);
	}
	
	public void Pessoa2 (String endereço) {
		setEndereço(endereço);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", endereço=");
		builder.append(endereço);
		builder.append("]");
		return builder.toString();
	}

	
	
}
