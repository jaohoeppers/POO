import java.util.ArrayList;

public class Arraylistexemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> itens = new ArrayList<String>();
		itens.add("red");
		itens.add(0, "yellow");
		
		System.out.print("Display list contents with counter-controlled loop:");
		
	for (int i=0; i<itens.size();i++)
		System.out.printf("%s,", itens.get(i));
	
	display(itens,"%ndisplay list contents with enhanced for statement:");
	itens.add("green");
	itens.add("yellow");
	display(itens, "List with two new elements: ");
	itens.remove("yellow");
	display(itens,"remove first instance of yellow");
	itens.remove(1);
	display(itens,"remove second list element (green): ");
	
	System.out.printf("\"red\" is %sin the list%n)",itens.contains("red") ? "":"not ");
	
	System.out.printf("Size: %s%n", itens.size());
		
	}

	private static void display(ArrayList<String> itens, String header) {
		System.out.printf(header);
		
		for (String iten : itens)
			System.out.printf(" %s", iten);
		System.out.println();	
	}

}
