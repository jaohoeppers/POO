import java.util.Random;
import java.util.Scanner;

public class FUNCOES {
	public static int[] criaVetor(int tamanho){
		Random gerador = new Random();
		int[]v = new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			v[i] = gerador.nextInt(100);
		}
		return v;
	}
	
	public static String mostrar (int[]v){
		String saida="";
		for(int i=0;i<v.length;i++) {
			saida=saida+v[i]+" | ";
		}
		return saida;
	}
	
	public static String mostrarTop (int[]v){
		StringBuilder saida=new StringBuilder();
		for(int i=0;i<v.length;i++) {
			saida.append(v[i]);
			saida.append(" | ");
		}
		return saida.toString();
	}
	
	public static void escada(int x) {
		
		for(int d=1;d<=x;d++) {
			System.out.println("");
			for(int q=1;q<=d;q++) {
				System.out.print(d);
			}
		}
	}
	
	public static void escada1(int x) {
		
		for(int d=1;d<=x;d++) {
			System.out.println("");
			for(int q=1;q<=d;q++) {
				System.out.print(q);
			}
		}
	}
	
	
	
	public static String escada2 (int x){
		StringBuilder saida=new StringBuilder();
		for(int d=1;d<=x;d++) {
			for(int q=1;q<=d;q++) {
				saida.append(d);
			}
			
			saida.append("\n");
		}
		return saida.toString();
	}
	
	public static double soma(double x,double y,double z) {
		double soma=x+y+z;
		return soma;
	}
	
	public static void posneg(double num) {
		if(num>0||num==0) {
			System.out.println("P");
		}
		if(num<0) {
			System.out.println("N");
		}
		
	}
	
	public static double somaimp(float x,double y) {
		double soma=((x/100)*y)+y;
		return soma;
	}
	
	public static void convhorario(int x,int y) {
		
		Scanner entrada=new Scanner(System.in);
		int ver=10;
		while(ver!=0) {
			if(x>12) {
				System.out.print(x-12+":"+y+" PM");
			}
			if(x<12) {
				System.out.println(x+":"+y+" AM");
			}
			
			System.out.println("Deseja continuar convertendo os horarios?");
			System.out.println("Se sim digite qualquer valor, se nao digite 0");
			ver=entrada.nextInt();
			
			if(ver!=0) {
				System.out.println("Digite seu horario em 2 numeros inteiros");
				x=entrada.nextInt();
				y=entrada.nextInt();
			}
			
			
		}entrada.close();
	}
	
	public static void prestacao(double x,int y) {
		if(y!=0) {
			float taxa1=(float)y*(float)0.01;
			double total=((x*0.3)+x)+(x*taxa1);
			System.out.println("Seu valor total de prestaçao é: "+total);
			
		}
	}
	
	public static int contador(String x) {
		int tam= x.length();
		return tam;
	}
	
	public static String contrario(String x) {
		int tam=x.length();
		char[]con=new char[tam];
		for(int y=0;y<tam;y++) {
			con[y]=x.charAt(y);
		}
		
		StringBuilder cont=new StringBuilder();
		
		for(int y=tam;y>0;y--) {
			cont.append(con[y-1]);

		}
		return cont.toString();
	}
	
		public static void contrario2(String x) {
			int tam=x.length();
			char[]con=new char[tam];
			for(int y=0;y<tam;y++) {
				con[y]=x.charAt(y);
			}			
			for(int z=tam;z>0;z--) {
				System.out.print(con[z-1]);

			}
		}
		
		public static void craps(int x) {
			
			Scanner entrada=new Scanner(System.in);
			int val=33;
			
			while(val!=1) {
			val=33;
			
			System.out.println("Para lancar os dados novamente digite 0");
			int lin=entrada.nextInt();
			
			Random gerador = new Random();
			int a = 1+(gerador.nextInt(5));
			System.out.println("O primeiro dado deu: "+a);
			int b = 1+(gerador.nextInt(5));
			System.out.println("O segundo dado deu: "+b);
			int c=a+b;
			System.out.println("A soma deu: "+(c));
			
			if(c==7||c==11) {
				System.out.println("Voce é um natural e ganhou o jogo,");
				System.out.println("Deseja jogar novamente? se sim digite 0 se nao digite 1");
				val=entrada.nextInt();
				}
			if(val==33) {
				if(c==2||c==3||c==12) {
					System.out.println("VOCE PERDEU,NAO SEI PQ, EU NAO ENTENDI O JOGO DIREITO");
					System.out.println("Se deseja jogar novamente digite 0 se nao digite 1");
					val=entrada.nextInt();
				}
				if(c==4||c==5||c==6||c==8||c==9||c==10) {
					System.out.println("Voce ganhou um ponto, tem que continuar tirando entre 4,5,6,8,9 ou 10 para continuar jogando");
					System.out.println("Tecle 0 para continuar");
				}
				
			}
			
			}
			System.out.println("Obrigado por jogar");
			entrada.close();
		}
	
		
		public static String valdata(String x) {
			
			String dia=x.substring(0,3);
			String mes=x.substring(3,5);
			String ano=x.substring(5,10);
			
			StringBuilder data=new StringBuilder();
			data.append(dia);
			data.append("/");
			
			if(mes=="01") {
				data.append("Janeiro");
			}
			if(mes=="02") {
				data.append("Fevereiro");
			}
			if(mes=="03") {
				data.append("Março");
			}
			if(mes=="04") {
				data.append("Abril");
			}
			if(mes=="05") {
				data.append("Maio");
			}
			if(mes=="06") {
				data.append("Junho");
			}
			if(mes=="07") {
				data.append("Julho");
			}
			if(mes=="08") {
				data.append("Agosto");
			}
			if(mes=="09") {
				data.append("Setembro");
			}
			if(mes=="10") {
				data.append("Outubro");
			}
			if(mes=="11") {
				data.append("Novembro");
			}
			if(mes=="12") {
				data.append("Dezembro");
			}
			data.append("/"+ano);
			return data.toString();
		}
		
	
}

