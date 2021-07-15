class SQLTrainer extends Trainer {
	

    public static void main(String [] args) {
	
	     SQLTrainer ram = new SQLTrainer();
		
		 Trainer trainerKumar = new Trainer("CSE", "payilagam");
		
		 
		 
		 System.out.println(ram.dept);
		 System.out.println(ram.institute);
		
		 ram.training();
		
		 System.out.println(ram.getsalary());
		
		 System.out.println(trainerKumar.dept);
		 System.out.println(trainerKumar.institute);
		
		 trainerKumar.training();
		
		 System.out.println(trainerKumar.getsalary());
		
		
	
	}
	
    void training() {
	    
	   System.out.println("Not Getting Trained");
	   
   }


}