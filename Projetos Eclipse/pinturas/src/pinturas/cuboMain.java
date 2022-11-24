package pinturas;

public class cuboMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		cubo cubao=new cubo();
		
		double area=5.9;
		int tipo=3;
		double rendimento=3;
		
		cubao.Area(area);
		cubao.litros(rendimento);
		cubao.preco(tipo);
		
		System.out.println(cubao);
		
		
	}
}
