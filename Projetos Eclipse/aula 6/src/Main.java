import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listapessoas l=new listapessoas();
		
		pessoa p =new pessoa("rodrigo","lindinho@gmail.com");
		
		l.add(p);
		
		p =new pessoa("tereza","terezinha@gmail.com");
		
		l.add(p);
		
		p =new pessoa("joao","jao@gmail.com");	
		
		l.set(1,p);
		
		List<pessoa>lista=l.getLista();
		
		for (pessoa item: lista) {
			System.out.println(item.toString());
		}
		
	}

}

/*

nao permitir nomes iguais
buscar todos os dominios de email
remover pelo nome
alterar pessoa
fazer uma busca usando "like" inicial do nome
mostrar idade
buscar idade > paramentro
aniversariantes do mes 

*/