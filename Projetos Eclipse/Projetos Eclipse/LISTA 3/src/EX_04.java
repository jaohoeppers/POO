import java.util.Scanner;

public class EX_04 {
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero de habitantes do pais A ");
		double paisa = entrada.nextDouble();
		
		System.out.println("Digite o numero de habitantes do pais B ");
		double paisb = entrada.nextDouble();
	
		System.out.println("Digite a taxa de crescimento do pais A ");
		float taxaa = entrada.nextFloat();
		
		System.out.println("Digite a taxa de crescimento pais B ");
		float taxab = entrada.nextFloat();
		
		int cont =0;
		
		while (paisb>paisa){
			paisb = paisb+(paisb*taxab);
			paisa = paisa+(paisa*taxaa);
			cont = cont+1;
		}
		
		System.out.println("Foi multiplicado "+cont+" vezes ate o pais A passar o pais B");
		System.out.println("O pais A ficou com "+paisa+" habitantes");
		System.out.println("O pais B ficou com "+paisb+" habitantes");
		
		entrada.close();
		
	} 

}