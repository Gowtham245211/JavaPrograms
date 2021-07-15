class Trainer {

   String dept = "Java", institute = "Payilagam";
   private int salary = 10000;
	
   public Trainer () {
	   
	   this.dept = dept;
	   this.institute = institute;
	   this.salary = salary;
	   
   }
	
   public Trainer (String dept, String institute) {
	   
	   this.dept = dept;
	   this.institute = institute;
	   this.salary = salary;
	   
   }
	
   
   
   public int getsalary() {
   
       return this.salary;
   }
	
   void training() {
	    
	   System.out.println("Getting trained");
	   
   }
	
}   