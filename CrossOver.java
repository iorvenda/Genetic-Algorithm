import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CrossOver
{String gen1,gen2;
String population="";
DataOutputStream save;
ArrayList<String> data = new ArrayList<String>();
// this should get the chromosones from cross them then save it back into the population but first this
// should be save in a array
  public CrossOver(String gen1,String  gen2)
  {
	  this.gen1=gen1;
	  this.gen2=gen2;
  }
  public void Cross() throws IOException
  { 	 	  
  String second_half=gen2.substring(gen2.length()/2, gen2.length());

  population = gen1.substring(0, (gen1.length()/2)).concat(second_half);
  try {
		save = new DataOutputStream(new FileOutputStream("population.txt",true));
		 save.writeBytes(population.toString()+"\n");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
  }

}
