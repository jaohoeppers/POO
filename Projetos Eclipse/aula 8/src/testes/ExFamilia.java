package testes;

public class ExFamilia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Familia rodrigo = new Familia();
		rodrigo.setNome("Rodrigo");
		Familia.setSobrenome("Curvello");
		
		Familia iram = new Familia();
		iram.setNome("Iram");
		Familia.setSobrenome("Outra familia");
		
		System.out.println(rodrigo.getNome()+ " "+ Familia.getSobrenome());
		System.out.println(iram.getNome() + " "+ Familia.getSobrenome());
		
	}

}
