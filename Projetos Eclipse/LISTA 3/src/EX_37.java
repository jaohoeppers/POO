import java.util.Scanner;

public class EX_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int ver=0;
		int alunos=0;
		int cont=1;
		int certas=0;
		int soma=0;
		int maiorn=0;
		int menorn=0;
		String resp="z";
		String melhoral="z";
		String pioral="z";
		
		
		while(ver!=1) {
			
			cont=1;
			certas=0;
		
			System.out.println("Digite seu nome");
			String nome=entrada.next();
			alunos++;
			
			
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("a")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("b")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("c")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("d")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("e")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("e")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("d")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("c")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("b")) {
				certas=certas+1;}
				cont++;
			System.out.println("Digite sua "+cont+"º resposta");
			resp=entrada.next();
			if(resp.equalsIgnoreCase("a")) {
				certas=certas+1;}
				cont++;
			
			soma=soma+certas;
			
			if(alunos==1) {
				melhoral=nome;
				pioral=nome;
				maiorn=certas;
				menorn=certas;}
			
			else {
				if(maiorn<certas) {
					maiorn=certas;
					melhoral=nome;}
				
				if(menorn>certas) {
					menorn=certas;
					pioral=nome;}
				 }				
			
			System.out.println("Deseja encerrar a contagem?");
			System.out.println("Se SIM digite 1, se NAO digite qualquer outro valor");
			ver=entrada.nextInt();		
		}
		
		System.out.println("O pior aluno foi: "+pioral+" e sua nota foi: "+menorn);
		System.out.println("O melhor aluno foi "+melhoral+" e sua nota foi: "+maiorn);
		System.out.println("O total de alunos que utilizou o sistema foi: "+alunos);
		System.out.println("E a media geral da truma foi de: "+((float)soma/(float)alunos));
		
		
	}

}
