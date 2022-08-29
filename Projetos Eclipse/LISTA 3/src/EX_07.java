import java.util.Scanner;

public class EX_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		if(num2>num1) {
			for(int x=num1;x<=num2;x++) {
				System.out.println(x);}}
		if(num1>num2) {
			for(int x=num2;x<=num1;x++) {
				System.out.println(x);}}
		
	entrada.close();
	}

}
