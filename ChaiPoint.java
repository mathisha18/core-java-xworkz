class ChaiPoint{
   String location = "kormangala";
   /*static String tea = "Masala Tea";
   static String tea1 = "Ginger Tea";
   static String tea2 = "Lemon Tea";
   static String tea3 = "Elaichi Tea";
   static String tea4 = "Ayurvedic Tea";
   static String tea5 = "Hot Green Tea";
   static String tea6 = "Kesar Elaichi Tea";
   static String tea7 = "Sulemani Tea";
   static String tea8 = "Irani Tea";
   static String tea9 = "Lemon Grass Tea";
   static String chaiAvailable[] = {tea, tea1, tea2 , tea3 , tea4, tea5, tea6, tea7, tea8, tea9};*/
   static String chaiAvailable[] = {null, null, null, null, null};
   static  int index;

		  
   public static boolean addChai(String chai){
	   boolean isAdded = false;
	   
	   if(chai != null){
		  chaiAvailable[index] = chai;
		  index++ ;
		   isAdded = true;
	   }else{
		   System.out.println("Cannot add chai, as it is a null value");
	   }
	   return isAdded;
   }
	
	// method
	public static void getAllChaiAvailable(){
	System.out.println("Invoking getAllChaiAvailable");
	
	/* for(String individualChai : chaiAvailable){
	         System.out.println(individualChai);
	}*/
	
	   for(int chai=0 ; chai < chaiAvailable.length; chai++){
		   String reference = chaiAvailable[chai];
		   System.out.println("Accessing chai " +reference+ " at " +chai);
	   }
	   System.out.println("end of getAllChaiAvailable");
	}

}