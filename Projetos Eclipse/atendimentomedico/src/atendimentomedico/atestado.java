package atendimentomedico;

public class atestado extends operacao {
	
	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("atestado [cid=");
		builder.append(cid);
		builder.append("]");
		return builder.toString();
	}
	
	

}
