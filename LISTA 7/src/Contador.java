
public class Contador {

	private int num1;
	private int num2;
	
	public Contador(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		
		if(num1>num2){
			int aux=num1;
			num1=num2;
			num2=aux;
		}
		
	}
	
	
	public int[] contadora() {
//	System.out.println(num1);
//	System.out.println(num2);	
	
		int[] numeros = new int[num2-num1-1];
		
		int cont=0;
		
		for (int x = num1+1; x < num2; x++) {
			
			numeros[cont]=x;
			cont++;
		
		}
		return numeros;
	}
	
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		if(num1<num2)
		this.num2 = num2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contador [num1=");
		builder.append(num1);
		builder.append(", num2=");
		builder.append(num2);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
