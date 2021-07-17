class Samsung extends FactoryDemo {

     static int price = 5000;
  
  public static void main(String [] args) {
  
      Samsung sam = new Samsung();
	  
	  sam.browse();
	  System.out.println(sam.price);
	  
	  FactoryDemo.price = 20;
	  
	  System.out.println(FactoryDemo.price);
  
  
  }
  
  void verifyFingerPrint() {
  
       System.out.println("Verifying Finger Print");
  }
  
  void providePattern() {
  
      System.out.println("Providing Pattern");
  }
	
  int call(int seconds) {
	  
	  System.out.println("Calling");
	  return seconds;
  }
   
	
  void sendMessage() {
	  
	  System.out.println("Sending Message");
  }
   
  void receiveCall() {
	  
     System.out.println("Receiving Call");
  }


}