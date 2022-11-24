package atendimentomedico;

import java.util.ArrayList;
import java.util.List;

public class Medico extends pessoa {
	
	private List<Especialidade> Especialidades = new ArrayList<Especialidade>();

	public List<Especialidade> getEspecialidades() {
		return Especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		Especialidades = especialidades;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [Especialidades=");
		builder.append(Especialidades);
		builder.append("]");
		return builder.toString();
	}
	
	

}
