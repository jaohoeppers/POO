import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;


public class calendario {
	
	public static List<Date> diasdomesano(int mes, int ano){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH,mes);
		cal.set(Calendar.YEAR, ano);
		int quantidadededias = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		List<Date> listadias = new ArrayList<Date>();
		for (int i = 0; i <= quantidadededias; i++) {
			Calendar calendario = Calendar.getInstance();
			calendario.set(Calendar.DATE, i);
			calendario.set(Calendar.MONTH, mes);
			calendario.set(Calendar.YEAR, ano);
			Date hoje = calendario.getTime();
			listadias.add(hoje);
			
		}
		return listadias;
		
		}
	
	public static long segundosdatas(Date inicio, Date fim) {
		long secin = inicio.getTime();
		long secfi = fim.getTime();
		long dif = (secfi - secin)/1000;
		return dif;
	
	}

}
