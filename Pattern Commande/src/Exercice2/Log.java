package Exercice2;


import java.io.FileWriter;
import java.io.IOException;

public class Log {
	
	public static void writeLog(String txt)
	{

		String destination = "Ex2Cars_log.txt";
		
		FileWriter writer = null;

		try{
			writer = new FileWriter(destination, true);
		    writer.write(txt,0,txt.length());
		    writer.write("\n");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		finally{
		  if(writer != null){
			  try{
				  writer.close();
			  }
			  catch(IOException ex){
				  ex.printStackTrace();
			  }
		  }
		}
	}
}
