import java.sql.Array;
import java.util.Scanner;

public class Fitness 
{int fitness_groups;
	String input;
	
 Fitness(String input,int fitness_groups)
 {
	 this.input=input;
	 this.fitness_groups= fitness_groups;
 }
 public int FitnessCount()
 {   

 Scanner scan = new Scanner(System.in);
 String[] array= new String[fitness_groups];
	int[] groups= new int[array.length+1];
 

    for(int i=0;i<fitness_groups+1;i++)// takes in the lengths of the groups
    {
    	 
  
            if(i==0)
            {
            	groups[i]=0;
            	
            }
            	
            else {
            	System.out.println("Enter the length of each group in order on the Chrome.. ");
            	String input = scan.next();
            	groups[i]=Integer.parseInt(input);
            }
        }
        
       
    
   
    int amt=0;
	
       for(int count=0 ;count!=groups.length-1;count++)
	 { 
    	
    		if(count==0)
    		{array[count]= input.substring(groups[count], groups[count+1]);
    			
    		}else {
    			amt+=groups[count];
           array[count]= input.substring(amt, groups[count+1]+amt);}
    	 
	 }
       
	  scan.close();
	 
	return fitness_value(array);
	 
 } 
 int fitness_value(String []array) 
 {
	  // convert the value at each array to numbers then sum all togather and return it
	 
	 int length = array.length;
	 int sum=0;
	 for(int i=0; i!=length;i++)
	 {
		sum+=Integer.parseInt(array[i],2); 
	 }
	return sum;
	 
 }
}
