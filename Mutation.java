import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * @author iorvenda
 *
 */
public class Mutation 
{
	String num;
	DataOutputStream save;
public Mutation(String num)
 {
	 this.num=num;
	
 }
 public void Mutate()
 { StringBuilder string = new StringBuilder(num);
	Random gen= new Random();
	int index=gen.nextInt(num.length()-1);
	if(num.charAt(index)=='0')
	{
		string.setCharAt(index,'1');
	
		
	}
	else {
		string.setCharAt(index,'0');
	}
	
	 try {
		 save = new DataOutputStream(new FileOutputStream("population.txt",true));
		save.writeBytes(string+"\n");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }
	

 
}
