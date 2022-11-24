import java.util.Scanner;

public class Orientaçao_objetoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bola bolinha=new bola();
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("digite o tipo: ");
		String tipo=entrada.nextLine();
		
		bolinha.setMaterial("fibra");
		bolinha.setTipo(tipo);
		bolinha.setPreco(50);
		
		System.out.println(bolinha);
		
		entrada.close();
	}

}
