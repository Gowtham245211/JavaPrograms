interface Actor {

   boolean makeUpRequired = true;
   
   String address = "Chennai"; /* By default interface variables are public and static */
   
   void act(); /* By default interface methods are abstract and public*/
   void dance();
   void sing();
   
}