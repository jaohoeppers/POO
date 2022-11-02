
public class calc {

	private double n1;
	private double n2;
	
	
	
	//sobrecarga de metodos
	public calc(double n1,double n2) {
		this.n1=n1;
		this.n2=n2;
	}
	public calc(double n1) {
		this.n1=n1;
	}
	public calc() {
		
	}
	
	
	
	

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("calc [n1=");
		builder.append(n1);
		builder.append(", n2=");
		builder.append(n2);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
