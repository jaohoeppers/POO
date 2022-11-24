import java.util.Scanner;

public class EX_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a area a ser pintada: ");
		float area = entrada.nextFloat();
		
		float litros = area/3;
		float latas = litros/18;
		float preco = latas*80;
		
		System.out.println("O total de litros é de: "+litros);
		System.out.println("O total de latas é de: "+latas);
		System.out.println("O valor total é de: R$"+preco);
		
		entrada.close();

	}

}
