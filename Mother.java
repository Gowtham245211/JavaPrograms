interface Mother{ /*private and protected not allowed for interface */

  /* Interface doesn't have a constructor */

   int amount = 5; /* The state value of an interface is actually
                      final and static. Private and protected not allowed */

   public static void main(String[] args) {


   }

   void play();/* Interface method is actually abstract so we cannot make it
                  static and final. Interface method is by default public
                  even if not mentioned.*/


}
