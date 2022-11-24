
public class funcoes {

	public static void tan(String[]x) {

		String[] trans=new String [x.length];
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
		for(int y=0;y<x.length;y++) {
			if(x[y]=="a") {
				trans[y]="u"; 
				a++;
			}
			if(x[y]=="t") {
				trans[y]="a"; 
				b++;
				}
			
			if(x[y]=="g") {
				trans[y]="c"; 
				c++;
			}
			if(x[y]=="c") {
				trans[y]="g"; 
				d++;
			}			
		}
		System.out.println("Vetor original");
		for(int y=0;y<x.length;y++) {
			System.out.println(x[y]);
		}
		
		
	}
}
