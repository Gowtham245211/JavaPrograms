abstract class Father { /* Abstract class cannot be protected and private*/

   protected Father () { /* Abstract class have constructor but it should never be private*/

      System.out.println("This is father class");
 
   }

   static int value = 5;/* The state value cannot be made as final but it can be static*/

   public static void main(String[] args) {


   }

   public abstract void watchTV();//Abstract method cannot be made as static and final

   public void read() { /*Abstract class can have non abstract methods 
                                 but cannot be made static and final if over-ridden*/

       System.out.println("Reading Novel");

   }

   public final void write() { /*Abstract class can have non abstract methods and
                                  can be made as static and final if not overridden*/

       System.out.println("Write comics");
 
  }


}
