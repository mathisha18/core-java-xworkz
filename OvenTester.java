class OvenTester{
  public static void main(String test[]){
     System.out.println("Main Started");
     boolean connected = Oven.onOroff();
	 System.out.println("Is Oven connected" + connected);
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 
	 Oven.decreaesTemp();
	 Oven.decreaesTemp();
	 Oven.decreaesTemp();
	 Oven.decreaesTemp();
	 
	 boolean connected1 = Oven.onOroff();
	 System.out.println("Is Oven connected" + connected1);
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 
	 Oven.decreaesTemp();
	 Oven.decreaesTemp();
	 Oven.decreaesTemp();
	 Oven.decreaesTemp();


	 System.out.println("Main Ended");
  }

}