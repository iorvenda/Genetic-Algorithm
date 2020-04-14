import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Audio_toBinary {

	public static void main(String[] args) throws IOException 
	{
		try {
			BufferedInputStream audio= new BufferedInputStream(new FileInputStream("audio.m4a"));
			
			int data = audio.read();
		    while(data != -1){
		        data = audio.read();
		        System.out.println(Integer.toBinaryString(data));
		        
		    }
			audio.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
