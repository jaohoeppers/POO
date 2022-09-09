import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite seu nome de usuario");
		String nome = entrada.next();
		
		System.out.println("digite sua senha");
		String senha = entrada.next();
		
		while (senha.equalsIgnoreCase(nome)) {
		System.out.println("ter a senha igual ao nome nao permitido, digite uma senha valida");
		senha = entrada.next();
		
		}
		System.out.println("cadastro concluido");
		}
	} 

