package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quantpattmatch {

	public static void main(String[] args) {
		
		String name = "abcdeeebbb222ccc333";
		
		System.out.println(name.replaceAll("b{3}", "*"));
		System.out.println(name.replaceAll("c+", "*"));
		System.out.println(name.replaceAll("^a{1,2}", "X"));
		System.out.println(name.replaceAll("^abcdf*", "X"));
		
         /* These are all Quantifiers */
		
		StringBuilder strbr = new StringBuilder("I am Gowtham. ");
		strbr = strbr.append("I am a Rational thinker.");
		
		System.out.println(strbr);
		
		Pattern p = Pattern.compile("rational",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(strbr);
		
        System.out.println(m.matches());	
        
		/* Matcher can be used only once */
        
        m.reset();
        int count = 0;
        while (m.find()) {
        	count++;
        	System.out.println("Occurence "+count+" Starting at "+m.start()+" Ending at "+m.end());
        }
        
        String groupmatcher = "A He is a dog A";
        
        Pattern p1 = Pattern.compile("(A)(.+?)(A)");
        /* . is Every character and * zero or more occurences and + one or more occurences */
        Matcher m1 = p1.matcher(groupmatcher);
        
        while(m1.find()) {
        
            System.out.println("Occurence : " + m1.group(2));
        
        }
       
	}

}
