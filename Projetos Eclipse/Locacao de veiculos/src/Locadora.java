import java.util.List;
import java.util.ArrayList;

public class Locadora {
	
	private List<Veiculo> veiculos = new ArrayList<Veiculo>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Locacao> locacoes = new ArrayList<Locacao>(); 
	
	
	public boolean addveiculo (Veiculo nome) {
		
		veiculos.add(nome);
		return true;
	}
	public boolean addcliente (Cliente nome) {
		
		clientes.add(nome);
		return true;
	}
	public boolean addlocacao (Locacao nome) {
	
		locacoes.add(nome);
		return true;
	}
	
	public boolean setveiculo (int num, Veiculo nome) {
		
		veiculos.set(num, nome);
		return true;
	}
	
	
	
	
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}


	

}
