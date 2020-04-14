
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gene_wheel
{int picked;
  int population_size;
  Scanner scan;
  File file ;
  String picked_gene="";
  ArrayList<String> num;
  DataInputStream input;
  // randomly picks a gene then returns it
 Gene_wheel()
 {
	
 }
 
 String picked_gene() 
 {   
	 num=new ArrayList<String>();
	
	try {
		file =new File("population.txt");
		scan = new Scanner(file);
		
		while(scan.hasNextLine()==true)
		 {
			
			 num.add(scan.nextLine());
			 
			  
		 }
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	 Random gen = new Random();
		int picked = gen.nextInt(num.size()-1);
	 picked_gene=num.get(picked); 
	scan.close();
	return picked_gene;
	 
 }

}
