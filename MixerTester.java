class MixerTester{
  public static void main(String test[]){
     System.out.println("Main Started");
     boolean connected = Mixer.onOroff();
	 System.out.println("Is Mixer connected" + connected);
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 
	 Mixer.decreaesSpeed();
	 Mixer.decreaesSpeed();
	 Mixer.decreaesSpeed();
	 Mixer.decreaesSpeed();
	 
	 boolean connected1 = Mixer.onOroff();
	 System.out.println("Is Mixer connected" + connected1);
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 
	 Mixer.decreaesSpeed();
	 Mixer.decreaesSpeed();
	 Mixer.decreaesSpeed();
	 Mixer.decreaesSpeed();


	 System.out.println("Main Ended");
  }

}