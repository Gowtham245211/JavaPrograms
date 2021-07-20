package tamilnadu.chennai;

public class CommonManinChennai implements TrafficRulesChennai {


    public static void main(String [] args) {
		
		 CommonManinChennai a = new CommonManinChennai();
		
		 a.goByDieselVehicle();
		 a.goByBicycle();
		
	}
	  
	public void goByDieselVehicle() {
			 
		System.out.println("We go by DieselVehicle");
    }
      
	public void goByBicycle() {
			 
	    System.out.println("We go by Bicycle");
    }
	  
	
}