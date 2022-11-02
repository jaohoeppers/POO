import java.util.Scanner;

public class EX_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite uma data tipo DD/MM/AAAA");
		String data=entrada.next();
		String datat=FUNCOES.valdata(data);
		System.out.println(datat);
		entrada.close();
	}

}
