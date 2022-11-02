import java.util.Scanner;
public class EX_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite suas 4 notas: ");
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		
		float media = (num1+num2+num3+num4)/4;
		
		System.out.println("Sua media é de: "+ media);
		
		entrada.close();

	}

}
