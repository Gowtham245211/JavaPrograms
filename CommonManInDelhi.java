package india.newDelhi;
import tamilnadu.chennai.TrafficRulesChennai;

public class CommonManInDelhi implements TrafficRulesDelhi, TrafficRulesChennai {
	
	    String trafficCommissioner = "Vibin";

       public static void main(String [] args) {

             CommonManInDelhi d = new CommonManInDelhi();
		   
		     TrafficRulesChennai c = new CommonManInDelhi();
	         
		      d.dontGoByDieselVehicle();
	          d.goByDieselVehicle();
		      d.goByBicycle();
		      System.out.println(d.trafficCommissioner);
		   
		   
		      
	          c.goByDieselVehicle();
		      c.goByBicycle();
		      System.out.println(c.trafficCommissioner);
			
	   }
	   
	    public void dontGoByDieselVehicle() {
			
			System.out.println("We don't go by DieselVehicle");
		}
    
	    public void goByBicycle() {
			
			System.out.println("We go by Bicycle");
		}
	   
	    public void goByDieselVehicle() {
			 
			 System.out.println("We go by DieselVehicle");
		}


}