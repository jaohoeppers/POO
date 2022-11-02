
public class Contadormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador numero=new Contador(1,10);
		
		int[] vet = numero.contadora();
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}	
	}
}
