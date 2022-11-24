import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Locacao2 {
	
	public  Locacao2(Cliente nome) {
		
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


	public long contadias(Calendar inicio, Calendar fim) {

		LocalDate data1= LocalDate.of(inicio.get(Calendar.YEAR),inicio.get(Calendar.MONTH),inicio.get(Calendar.DATE));
		LocalDate data2= LocalDate.of(fim.get(Calendar.YEAR),fim.get(Calendar.MONTH),fim.get(Calendar.DATE));

		var dias= ChronoUnit.DAYS.between(data1, data2);
		
		if(fim.get(Calendar.HOUR_OF_DAY)>12) {
			dias=dias+1;
		}

		return dias;
		
		
	}





}
