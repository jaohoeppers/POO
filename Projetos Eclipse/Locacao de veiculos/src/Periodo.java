import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Periodo {
	
	
	
	//public static List<Date> periodolocacao (Date inicio, Date fim) {
	//	List<Date> dias = new ArrayList<Date>();
	//	Calendar cal = Calendar.getInstance();
	//	cal.set(Calendar.DATE, inicio);
		
	//}
	public void periodo () {
		
	}
	
	public long contadias(Calendar inicio, Calendar fim) {
		
		Date datai = inicio.getTime();
		Date dataf = fim.getTime();
		
		//final double DAY_MILISECONDS = 24.0 * 60 * 60 * 1000;
		long dias = (long)((datai.getTime()- dataf.getTime()));
		return dias;
		
	}
	
	
	static List<Date> dias = new ArrayList<Date>();
	
	public void inicio (int hora, int dia, int mes, int ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, dia);
		cal.set(Calendar.MONTH,mes);
		cal.set(Calendar.YEAR, ano);
		cal.set(Calendar.HOUR_OF_DAY, hora);
		Date inicio=cal.getTime();
		dias.add(inicio);
	}
	
	public void fim (int hora, int dia, int mes, int ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, dia);
		cal.set(Calendar.MONTH,mes);
		cal.set(Calendar.YEAR, ano);
		cal.set(Calendar.HOUR_OF_DAY, hora);
		Date fim=cal.getTime();
		dias.add(fim);
	}
	
	//public static List<Date> periodolocacao (Date inicio, Date fim){
	//	DateTime inicio = new DataTime(2012,12,1,12,0);
		
		//Calendar cal = Calendar.getInstance();
		//Calendar call = Calendar.getInstance();
		//int dias = 
		//cal.setTime(dias.get(0));
		//call.setTime(dias.get(1));
		//int dias=(call.get(Calendar.DATE))-(cal.get(Calendar.DATE));
		//int meses=(call.get(Calendar.MONTH))-(cal.get(Calendar.MONTH));
		//int anos=(call.get(Calendar.YEAR))-(cal.get(Calendar.YEAR));
		//int horas=(call.get(Calendar.HOUR_OF_DAY))-(cal.get(Calendar.HOUR_OF_DAY));
		
		
		
		
		//cal.setTime(inicio);
		
		//int diai= inicio.getDay();
		//int mesi= inicio.getMonth();
		//int anoi= inicio.getYear();	
		
		//int diaf= fim.getDay();
		//int mesf= fim.getMonth();
		//int anof= fim.getYear();
		
		
	//}

}
