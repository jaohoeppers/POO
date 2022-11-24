import java.util.Date;
import java.util.Iterator;
import java.util.Calendar;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		//Date hj =new Date();
		//hj.
		//System.out.println(hj);
		
		//Calendar calendario = Calendar.getInstance();
		//calendario.set(Calendar.DAY_OF_MONTH, 24);
		//calendario.set(Calendar.MONTH, 3);
		//calendario.set(Calendar.YEAR, 1978);
		//calendario.set(Calendar.HOUR_OF_DAY, 13);
		//calendario.set(Calendar.MINUTE, 30);
		//calendario.set(Calendar.SECOND, 55);
		//Date dt =calendario.getTime();
		//System.out.println(dt);
		
		List<Date> lista = calendario.diasdomesano(2, 2000);
		for (Iterator<Date> iter = lista.iterator(); iter.hasNext();) {
			Date element = (Date) iter.next();
			System.out.println(iter);
		}
			
		
		
		
		
	}

}
