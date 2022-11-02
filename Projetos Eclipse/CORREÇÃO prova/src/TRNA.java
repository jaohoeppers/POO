import java.util.Arrays;

public class TRNA {

	private int tam;
	private String[]fita;
	private String[]transcricao;
	
	public TRNA(int tam) {
		this.tam=tam;
		fita = new String[tam];
		transcricao = new String[tam];
	}
	
	public void transcricao() {
		for (int i = 0; i < fita.length; i++) {
			if(fita[i].equals("A")) {
				transcricao[i]="U";
			}else if(fita[i].equals("T")) {
				transcricao[i]="A";
			}else if(fita[i].equals("G")) {
				transcricao[i]="C";
			}else if(fita[i].equals("C")) {
				transcricao[i]="G";
			}
		}
	}
	
	
	
	
	
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}
	public String[] getFita() {
		return fita;
	}
	public void setFita(String[] fita) {
		this.fita = fita;
	}
	public String[] getTranscricao() {
		return transcricao;
	}
	public void setTranscricao(String[] transcricao) {
		this.transcricao = transcricao;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TRNA [tam=");
		builder.append(tam);
		builder.append(", fita=");
		builder.append(Arrays.toString(fita));
		builder.append(", transcricao=");
		builder.append(Arrays.toString(transcricao));
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
