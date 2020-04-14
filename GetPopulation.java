
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetPopulation {
	
	ArrayList<String> data = new ArrayList<String>();
	public GetPopulation()
	{
		
	}
   ArrayList<String> readData() throws IOException  
   {  
	  
	   File file = new File("population.txt");
	   Scanner scan = new Scanner(file);
	 
	   while(scan.hasNext())
	   { data.add(scan.nextLine());
		  
		}
	   scan.close();
	return data;
	
	
	   
   }
}
