class Oven{
    static  String name = "LG";
    static int minTemp;
	static int currentTemp;
	static int maxTemp = 10;
	static boolean isConnected;

	 //method
	 public static boolean onOroff (){
	   System.out.println("Invoking onOroff");
	   System.out.println("Parameter" + 0);
	   if(isConnected == false){
	        isConnected = true;
			System.out.println("Oven is Turned Onn.. Enjoy");
	   }
	   else if(isConnected == true){
	        isConnected = false;
			System.out.println("Oven is Turned Off..");
	   }
	   return isConnected;
	 }
	 // increaseTemp
	 public static void increaseTemp(){
		 System.out.println("Invoking increaseTemp");
		 System.out.println("List of parameters" + 2);
		 if(isConnected == true){
		  if(currentTemp < maxTemp){
			 currentTemp = currentTemp + 1;
			 System.out.println("The current temp is" + currentTemp);
		  }else{
			 System.out.println("Max Temp reached");
		   }
		 }else{
			   System.out.println("Oven not connected");
		   }
		 System.out.println("End of increaseTemp"); 
	 }
     // decreaesTemp
	 public static void decreaesTemp(){
		 System.out.println("Invoking decreaesTemp");
		 System.out.println("List of parameters" + 0);
		 if(isConnected == true){
		  if(currentTemp > minTemp){
			 currentTemp = currentTemp - 1;
			 System.out.println("The current temp is" + currentTemp);
		  }else{
			 System.out.println("Min Temp reached");
		   }
		 }else{
			   System.out.println("Oven not connected");
		   }
		System.out.println("End of decreaesTemp"); 
	
		 
	 }
	 


}
