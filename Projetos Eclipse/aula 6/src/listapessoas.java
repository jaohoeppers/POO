import java.util.ArrayList;
import java.util.List;

public class listapessoas {
	
	List<pessoa>Lista = new ArrayList<pessoa>();
	
	public List<pessoa> getLista() {
		return Lista;
	}

	public void setLista(List<pessoa> lista) {
		Lista = lista;
	}

	public boolean add(pessoa pessoa) {
		boolean ver=true;
		
		for (int i = 0; i < Lista.get.length; i++) {
			
		}
			
		
		Lista.add(pessoa);
		return true;
	}
	
	public boolean set(int num,pessoa pessoa) {
		Lista.set(num, pessoa);
		return true;
	}
	

}
