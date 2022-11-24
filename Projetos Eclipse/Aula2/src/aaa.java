import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Carregando");
		
		Scanner entrada = new Scanner(System.in);
		
		//para x de 0 ate <=10 faça
		int x = entrada.nextInt();
		int z = 0;
		for (z = 0; z <=10; z++){
			System.out.println(z+"º: "+x+" X "+z+" = "+(x*z));
			
			//f faz caber no float
			float num = 1.5f;

		try {//testa o sistema e mostra o erro
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println("Finalizado");
		
		
		
		
		
	}

}
