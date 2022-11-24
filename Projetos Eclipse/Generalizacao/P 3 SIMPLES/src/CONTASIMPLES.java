
public class CONTASIMPLES extends CONTA {

	public CONTASIMPLES(String banco) {
		super(banco);
		// TODO Auto-generated constructor stub
	}

	private double saldopoupança;
	boolean num=true;
	
	public boolean depositopoupança(double valor) {
		if (valor>0) {
		num =true;	
			
		}
		return num ;
	}
	
	public boolean saquepoupança(double valor) {
		if (valor<0) {
		num =false;	
			
		}
		return num ;
	}

	public double getSaldopoupança() {
		return saldopoupança;
	}

	public void setSaldopoupança(double saldopoupança) {
		this.saldopoupança = saldopoupança;
	}

	public boolean isNum() {
		return num;
	}

	public void setNum(boolean num) {
		this.num = num;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("CONTASIMPLES [saldopoupança=");
		builder.append(saldopoupança);
		builder.append(", num=");
		builder.append(num);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
