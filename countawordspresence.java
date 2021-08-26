package regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countawordspresence {

	public static void main(String[] args) throws IOException {
		
		File f = new File("/home/gowtham/Desktop/Resume.txt");
		//f.delete();
		
		//f.createNewFile();
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		String resumeline = " ";
		
		int count = 0;
		
		while((resumeline = br.readLine()) != null) {
			
		    /*Pattern p = Pattern.compile("Madurai");
			Matcher m = p.matcher(resumeline);*/
			
			Pattern p = Pattern.compile("[0-9]{10}");
			Matcher m = p.matcher(resumeline);
			
			while(m.find()) {
				count++;
				System.out.println("Occurence " + count +" starts at "+m.start()+" ends at "+m.end());
			}
		    
		    
		}
		
		br.close();

	}

}
