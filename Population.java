

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Population 
{
	int chromozone_size;
	ArrayList<String> store_population= new ArrayList<String>();
public Population(int chromozone_size)

{
	this.chromozone_size=chromozone_size;
}


public ArrayList<String> gene()
{
	
	Random num_gen=new Random();
	int count=0;
	
	
	while(count!=chromozone_size)
	{
		
		String one_or_two= String.valueOf(num_gen.nextInt(2));
		store_population.add(one_or_two);
		
		count++;
	}
	
	return store_population;
	
}
public String string_population() throws IOException
{   StringBuilder population = new StringBuilder(store_population.size());
	
	 int count=0;
	 while(count!=store_population.size())
	 {
		 population.append(store_population.get(count));
		 
		 count++;
	 }
	 DataOutputStream save = new DataOutputStream(new FileOutputStream("population.txt",true));
	 save.writeBytes(population.toString()+"\n");
	save.flush();
	save.close();
	return population.toString();
	
}

}
