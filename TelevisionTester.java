class TelevisionTester{
  public static void main(String test[]){
     System.out.println("Main Started");
     boolean connected = Television.onOroff();
	 System.out.println("Is Television connected" + connected);
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 
	 Television.decreaesVolume();
	 Television.decreaesVolume();
	 Television.decreaesVolume();
     Television.decreaesVolume();
	 
	 boolean connected1 = Television.onOroff();
	 System.out.println("Is Television connected" + connected1);
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 
	 Television.decreaesVolume();
	 Television.decreaesVolume();
	 Television.decreaesVolume();
     Television.decreaesVolume();


	 System.out.println("Main Ended");
  }

}