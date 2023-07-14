class Speaker1{
    static  String name = "JBL";
    static int minVolume;
	static int currentVolume;
	static int maxVolume = 30;
	static boolean isConnected;

	 //method
	 public static boolean onOroff (){
	   System.out.println("Invoking onOroff");
	   System.out.println("Parameter" + 0);
	   if(isConnected == false){
	        isConnected = true;
			System.out.println("Speaker is Turned Onn.. Enjoy");
	   }
	   else if(isConnected == true){
	        isConnected = false;
			System.out.println("Speaker is Turned Off..");
	   }
	   return isConnected;
	 }
	 // increaseVolume
	 public static void increaseVolume(){
		 System.out.println("Invoking increaseVolume");
		 System.out.println("List of parameters" + 2);
		 if(isConnected == true){
		  if(currentVolume < maxVolume){
			 currentVolume = currentVolume + 1;
			 System.out.println("The current volume is" + currentVolume);
		  }else{
			 System.out.println("Max Volume reached");
		   }
		 }else{
			   System.out.println("Speaker not connected");
		   }
		 System.out.println("End of increaseVolume"); 
	 }
     // decreaesVolume
	 public static void decreaesVolume(){
		 System.out.println("Invoking decreaesVolume");
		 System.out.println("List of parameters" + 0);
		 if(isConnected == true){
		  if(currentVolume > minVolume){
			 currentVolume = currentVolume - 1;
			 System.out.println("The current volume is" + currentVolume);
		  }else{
			 System.out.println("Min Volume reached");
		   }
		 }else{
			   System.out.println("Speaker not connected");
		   }
		System.out.println("End of decreaesVolume"); 
	
		 
	 }
	 


}
