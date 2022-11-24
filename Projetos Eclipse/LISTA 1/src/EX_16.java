import java.util.Scanner;

public class EX_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a area a ser pintada: ");
		float area = entrada.nextFloat();
		
		float litros1 = area/6;
		float latas1 = litros1/18;
		float preco1 = latas1*80;
		
		System.out.println("O total de litros é de: "+litros1);
		System.out.println("O total de latas de 18 litros é de: "+latas1);
		System.out.println("O valor total comprando apenas as latas de 18 litros é de: R$"+preco1);
		
		double latas2 = litros1/3.6;
		double preco2 = latas2*25;
	
		System.out.println();
		System.out.println("O total de litros é de: "+litros1);
		System.out.println("O total de latas de 3,6 litros é de: "+latas2);
		System.out.println("O valor total comprando apenas as latas de 3,6 litros é de: R$"+preco2);
		
		entrada.close();

	}

}
