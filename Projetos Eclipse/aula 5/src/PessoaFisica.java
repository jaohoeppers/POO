
public class PessoaFisica extends Pessoa {

	private String cpf;
	
	public PessoaFisica(String nome) {
		super(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());//chamar o contrutor da classe superior
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
