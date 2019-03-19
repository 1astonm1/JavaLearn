//import java.sql.Date;
import java.util.Calendar;

//import java.util.Properties;

public class Demo21 {
	public static void main(String[] args) {
		String os_name = System.getProperty("os.name");
		System.out.println(os_name);
		
		//Properties ps = System.getProperties();
		//ps.list(System.out);
		
		Runtime run = Runtime.getRuntime();
		System.out.println(run.freeMemory());
		System.out.println(run.maxMemory());
		System.out.println(run.totalMemory());
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day+"-"+dayOfWeek+"-"+hour+"-"+minute+"-"+second);
		
		
	}
}
