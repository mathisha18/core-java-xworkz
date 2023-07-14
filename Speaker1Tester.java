class Speaker1Tester{
  public static void main(String test[]){
     System.out.println("Main Started");
     boolean connected = Speaker1.onOroff();
	 System.out.println("Is Speaker connected" + connected);
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 
	 Speaker1.decreaesVolume();
	 Speaker1.decreaesVolume();
	 Speaker1.decreaesVolume();
     Speaker1.decreaesVolume();
	 
	 boolean connected1 = Speaker1.onOroff();
	 System.out.println("Is Speaker connected" + connected1);
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 
	 Speaker1.decreaesVolume();
	 Speaker1.decreaesVolume();
	 Speaker1.decreaesVolume();
     Speaker1.decreaesVolume();


	 System.out.println("Main Ended");
  }

}