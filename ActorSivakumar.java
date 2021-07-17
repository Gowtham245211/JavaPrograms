class ActorSivakumar implements Actor {


    static String address = "Coimbatore";/* The class memory is different for address variable Actor and ActorSivakumar classes */
	
	public ActorSivakumar(int age, String car) {
		
		
		this.address = address;
	}
	
	public ActorSivakumar() {
		
		this.address = address;
		
	}
	
	public static void main(String [] args) {
	
	ActorSivakumar as = new ActorSivakumar(65, "AudiCar");
		
		 as.act();
		 as.dance();
		 as.sing();
		 as.speaking();
		
		 System.out.println(as.address);
	
	Actor ac = new ActorSivakumar();
	
         ac.act();
		 ac.dance();
		 ac.sing();
		 /* ac.speaking(); In dynamic Binding the Class type of object is involved 
		                  hence this method should be available in Class method also */
		
		System.out.println(ac.address);
   
	
   }
	
   public void act() {
   
       System.out.println("acting");
   }
   public void dance() {
   
       System.out.println("dancing");
   }
   public void sing() {
   
      System.out.println("singing");
   
   }
	
   public void speaking() {
	   
	   System.out.println("speaking");
	   
   }
	
}