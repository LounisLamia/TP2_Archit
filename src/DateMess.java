import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateMess implements IJournal {
	public void outPut_Msg(String message) throws IOException{
	// TODO Auto-generated method stub
			SimpleDateFormat  sdf = new SimpleDateFormat("'Le : 'dd.MM.yyyy' Heure : ' HH:mm:ss");
	        String currentDateandTime = sdf.format(new Date(0));
	        StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
	        String callerClass = ste.getClassName();
	        System.out.println(message +" "+ currentDateandTime +" depuis la  classe :"+ callerClass);
		}
	
	public String outPut_Msg1(String message) throws IOException{
		// TODO Auto-generated method stub
		SimpleDateFormat  sdf = new SimpleDateFormat("'Le : 'dd.MM.yyyy' Heure : ' HH:mm:ss");
        String currentDateandTime = sdf.format(new Date(0));
        StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
        String callerClass = ste.getClassName();
        return message +" "+ currentDateandTime +" depuis la  classe :"+ callerClass;//
}
}

