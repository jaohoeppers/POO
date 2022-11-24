import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;

public class Locacao {
	
	//private Calendar inicio;
	protected Veiculo veiculo;
	protected Cliente cliente;
	
	//public Locacao(int diai,int mesi,int anoi,int horai,int diaf,int mesf,int anof, int horaf){
		
	//	Calendar data = Calendar.getInstance();
	//	Calendar data1 = Calendar.getInstance();
		
	//	data.set(Calendar.DATE, diai);
	//	data.set(Calendar.MONTH, mesi);
	//	data.set(Calendar.YEAR, anoi);
	//	data.set(Calendar.HOUR, horai);
		
	//	data1.set(Calendar.DATE, diaf);
	//	data1.set(Calendar.MONTH, mesf);
	//	data1.set(Calendar.YEAR,anof);
	//	data1.set(Calendar.HOUR_OF_DAY,horaf);
	//}	
	public Locacao(){
		
		//this.inicio=inicio;
		}
	
	public boolean validardata(Calendar inicioo){
		
		boolean diab=false;
		boolean mesb=false;
		String strDate=("");
		int dia=inicioo.get(Calendar.DATE);
		int mes=inicioo.get(Calendar.MONTH);
		int ano=inicioo.get(Calendar.YEAR);
		String diaa=("");
		String mess=("");
		
		if(dia<10) {
			diaa=("0"+dia);
			diab=true;
		}
		if(mes<10) {
			mess=("0"+mes);
			mesb=true;
		}
		
		if(diab) {
			strDate=(diaa+"/"+mes+"/"+ano);
		}
		if(mesb) {
			strDate=(dia+"/"+mess+"/"+ano);
		}
		if(diab&mesb) {
			strDate=(diaa+"/"+mess+"/"+ano);
		}
		else {
			strDate=(dia+"/"+mes+"/"+ano);
		}
	
	    String dateFormat = "dd/MM/uuuu";

	    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
	    .ofPattern(dateFormat)
	    .withResolverStyle(ResolverStyle.STRICT);
	    try {
	        LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
	        return true;
	    } catch (DateTimeParseException e) {
	       return false;
	    } 
	
	}
	

	
	public int contadias (Calendar fim, Calendar inicio) {
		
		int diai=inicio.get(Calendar.DATE);
		int diaf=fim.get(Calendar.DATE);
		int diastotal=0;
		int dias=0;
		int diasano=0;
		boolean um=false;
		boolean dois=false;
		boolean tres=false;
		
		inicio.set(Calendar.MONTH, inicio.get(Calendar.MONTH)-1);
		fim.set(Calendar.MONTH, fim.get(Calendar.MONTH)-1);
		
		if(((fim.get(Calendar.MONTH))-(inicio.get(Calendar.MONTH)))>1) {
			um=true;
			System.out.println("maior que 1");
		}	
		if (((fim.get(Calendar.MONTH))-(inicio.get(Calendar.MONTH)))<=0) {
			dois=true;
			System.out.println("menor que 0");
		}
		
		if((fim.get(Calendar.YEAR)-inicio.get(Calendar.YEAR))>1) {
			
			Calendar anos=Calendar.getInstance();
			anos.set(Calendar.YEAR, inicio.get(Calendar.YEAR)+1);
			
			for(int i=anos.get(Calendar.YEAR);i<fim.get(Calendar.YEAR);i++) {
				
				anos.set(Calendar.YEAR, inicio.get(Calendar.YEAR)+1);
				
				
				diasano=diasano+(anos.get(Calendar.DAY_OF_YEAR))+38;
				
				System.out.println("dias dos anos do meio: "+diasano);
				
			}
		}
		
		//if(fim.get(Calendar.YEAR))
		
//SOMATORIA DOS DIAS ENTRE OS MESES INICIAIS
		
		//if(um&tres)
		
		
		
		
		
		if ( (um) || (dois) ) {
			
			Calendar mes = Calendar.getInstance();
			
			int i=inicio.get(Calendar.MONTH);
			
			for(int x =(inicio.get(Calendar.MONTH)+inicio.get(Calendar.YEAR));x!=(fim.get(Calendar.MONTH)+fim.get(Calendar.YEAR));x++) {
				
				//if(i==inicio.get(Calendar.MONTH)) {
				//	i=i+i;
				//}
				
				//i=i-inicio.get(Calendar.YEAR);
				
				
				if (i>=11) {
					i=0;
				}
				
				if (i==inicio.get(Calendar.MONTH)){
					i++;
				}
				
				mes.set(Calendar.MONTH, i);
				mes.set(Calendar.YEAR, inicio.get(Calendar.YEAR));
				
				dias= dias+mes.getActualMaximum(Calendar.DAY_OF_MONTH);
				
				System.out.println("dias dos meses do meio: "+dias);
				
				i++;
			}
		}
		
		
		/*
		Calendar mesi=Calendar.getInstance();
		mesi.set(Calendar.MONTH, inicio.get(Calendar.MONTH));
		mesi.set(Calendar.YEAR, inicio.get(Calendar.YEAR));
		*/
		int diasmesi=inicio.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		if(inicio.get(Calendar.MONTH)==fim.get(Calendar.MONTH)) {
			
			diastotal=(fim.get(Calendar.DATE)-inicio.get(Calendar.DATE));
			
		}
		
		else {diastotal=((diasmesi)-diai-1)+diaf;
		
		}
		
		if(fim.get(Calendar.HOUR_OF_DAY)>12) {
			diastotal=diastotal+1;
		}
		System.out.println("dia inicio "+diai);
		System.out.println("dia final "+diaf);
		System.out.println("dias totais inicio + fim "+diastotal);
		
		return diastotal+dias+diasano;
		
	}
	
	
	
	
	
	
	

}
