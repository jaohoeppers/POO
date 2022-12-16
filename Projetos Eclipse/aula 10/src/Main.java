import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		Pato pato = new Pato();
		
		Animal[] animais = new Animal[4];
		
		animais[0]=animal;
		animais[1]=cachorro;
		animais[2]=gato;
		animais[3]=pato;
		
		for (int x=0; x<4;x++) {
			System.out.println(animais[x].falar());
		}
		
		
	}

}
