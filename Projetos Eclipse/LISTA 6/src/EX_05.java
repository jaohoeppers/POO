import java.util.Scanner;

public class EX_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite sua % de imposto");
		float taxa=entrada.nextFloat();
		System.out.println("Digite seu valor");
		double valor=entrada.nextDouble();
		
		double soma=FUNCOES.somaimp(taxa, valor);
		
		System.out.println("Seu valor foi de: "+soma);

		entrada.close();
	}

}
