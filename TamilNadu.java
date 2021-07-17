class TamilNadu extends SouthIndia {

     static String capital = "Chennai";
  
   public static void main(String[] args) {
   
	    System.out.println(India.capital);
	   
	    System.out.println(TamilNadu.capital);
	   
	   SouthIndia si = new TamilNadu();
	   
	   System.out.println(si.capital);
	   
	   si.cultivate();
	   si.livingStyle();
	   si.eat();
	   //si.Style(); Dynamic binding won't accept methods that are created in this class and not available in reference class
	   
	    
   
   }
   
   void speakLanguage() {
	   
	   System.out.println("Tamil");
   
   }
   
	void eat() {
	   
	   
   System.out.println("Eat Rice");
   }
   
	void dress() {
	   
	   System.out.println("Wearing Good Dress");
   
   }
	
   void cultivate() {
	   
	   System.out.println("Rice and Sugar cane cultivation");
   }
	
   void livingStyle() {
	   
	   System.out.println("Above Average development");
   }
	
   void Style() {
	   
	   System.out.println("Development");
   }

}