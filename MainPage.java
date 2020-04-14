import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MainPage {
	static Population  p1;
	static Population  p2;
	static GetPopulation g = new GetPopulation();
	
	public static void main(String[] args) throws IOException {
		
		
		 Scanner scan= new Scanner(System.in);
		  System.out.println("what number of the population size "); 
		  int s =scan.nextInt();
		  if(s!=0)
		  {
			  for(int i=0;i!=20;i++) 
		  { 
				  p1 = new Population(16);
		         p1.gene(); p1.string_population();
		  
		  } }
		  
		  else { 
			  Random gen = new Random(); 
			  Random gen1 = new Random();
			  Gene_wheel pick1= new Gene_wheel();
			  Gene_wheel pick2= new Gene_wheel();
		  
		  CrossOver cross = new CrossOver(g.readData().get(gen.nextInt(g.readData().size())),g.readData().get (gen1.nextInt(g.readData().size()))); 
		  }
	  
		  int count=0;
		  
		  int ss=g.readData().size(); while(count!=ss)
		  {//System.out.println(g.readData().get(count));
		  
		  count++; System.out.println(ss); }
		 
		 int i=0;
		while( i<g.readData().size()) {
		 System.out.println(g.readData().get(i));
		
         System.out.println(i);
         i++;
		}
		scan.close();
		/*System.out.println(p1.string_population()+"   "+p2.string_population());
		Gene_wheel g= new Gene_wheel(); 
		CrossOver c = new CrossOver(p1.string_population(),g.picked_gene());
		Mutation m = new Mutation(c.Cross());
		Fitness fit = new Fitness(p1.string_population(),4);
	
		System.out.println("Crossed "+c.Cross()+" "+"Mutate "+m.Mutate());
		System.out.println(fit.FitnessCount());*/

			
	} 

}
