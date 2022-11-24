import java.util.Scanner;

public class EX_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new scanner(Systen.in);
		
		System.out.println("Digite 3 numeros");
		
		float num1 = entrada.nextFloat();
		float num2 = entrada.nextFloat();
		if (num1>num2);
			float prim = num1;
			float seg = num2;
			else prim = num2;
				 seg = num1;
			
		float num3 = entrada.nextFloat();
		if (num3>prim);
			float ter = seg;
			seg = prim;
			prim = num3;
			
		
	}

}
