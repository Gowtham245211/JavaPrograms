import java.io.File;
import java.time.LocalDate;
import java.util.Date;

public class printmodifiedfiles {
	
	@SuppressWarnings("deprecation")

	public static void main(String[] args) {
		
		 File ff = new File("/home/gowtham/SoftwareLearning/eclipse-workspace/July 20/Interview Programs");
			
		    File [] myprograms = ff.listFiles();
		 
		    for (File f : myprograms) {
			 
			    Date date = new Date(f.lastModified());
			 
			    LocalDate d = LocalDate.now();
			 
			    int todaydate = d.getDayOfMonth();	 
			 
			    int filedate = date.getDate();
			 
			    if (filedate > (todaydate - 4)) {
				 
				    System.out.println(f.getName() + " created at " +  date.getDate() +"/"+ date.getMonth()+"/"+(1900 + date.getYear()));
			    }
	        }
   }
	
}
