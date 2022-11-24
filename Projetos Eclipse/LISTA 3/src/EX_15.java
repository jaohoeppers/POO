
public class EX_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 37;
		int num2 = 38;
		int num3 = 1;
		double num4 = (num1*num2)/num3;
		
		System.out.println("("+num1+"X"+num2+")/"+num3+"="+num4);
		
		for(int x=2;x<=37;x++) {
			num3=x;
			num1=num1-1;
			num2=num2-1;
			num4=(num1*(float)num2)/(float)num3;
			
			System.out.println("("+num1+"X"+num2+")/"+num3+"="+num4);	
		}
	}

}
