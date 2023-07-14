class Mixer{
    static  String name = "Pigeon";
    static int minSpeed;
	static int currentSpeed;
	static int maxSpeed = 10;
	static boolean isConnected;

	 //method
	 public static boolean onOroff (){
	   System.out.println("Invoking onOroff");
	   System.out.println("Parameter" + 0);
	   if(isConnected == false){
	        isConnected = true;
			System.out.println("Mixer is Turned Onn.. Enjoy");
	   }
	   else if(isConnected == true){
	        isConnected = false;
			System.out.println("Mixer is Turned Off..");
	   }
	   return isConnected;
	 }
	 // increaseSpeed
	 public static void increaseSpeed(){
		 System.out.println("Invoking increaseSpeed");
		 System.out.println("List of parameters" + 2);
		 if(isConnected == true){
		  if(currentSpeed < maxSpeed){
			 currentSpeed = currentSpeed + 1;
			 System.out.println("The current speed is" + currentSpeed);
		  }else{
			 System.out.println("Max Speed reached");
		   }
		 }else{
			   System.out.println("Mixer not connected");
		   }
		 System.out.println("End of increaseSpeed"); 
	 }
     // decreaesSpeed
	 public static void decreaesSpeed(){
		 System.out.println("Invoking decreaesSpeed");
		 System.out.println("List of parameters" + 0);
		 if(isConnected == true){
		  if(currentSpeed > minSpeed){
			 currentSpeed = currentSpeed - 1;
			 System.out.println("The current speed is" + currentSpeed);
		  }else{
			 System.out.println("Min Speed reached");
		   }
		 }else{
			   System.out.println("Mixer not connected");
		   }
		System.out.println("End of decreaesSpeed"); 
	
		 
	 }
	 


}
