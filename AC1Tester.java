class AC1Tester{
  public static void main(String test[]){
     System.out.println("Main Started");
     boolean connected = AC1.onOroff();
	 System.out.println("Is AC connected" + connected);
	 AC1.increaseTemp();
	 AC1.increaseTemp();
	 AC1.increaseTemp();
	 AC1.increaseTemp();
	 
	 AC1.decreaesTemp();
	 AC1.decreaesTemp();
	 AC1.decreaesTemp();
	 AC1.decreaesTemp();
	 
	 boolean connected1 = AC1.onOroff();
	 System.out.println("Is AC connected" + connected1);
	 AC1.increaseTemp();
	 AC1.increaseTemp();
	 AC1.increaseTemp();
	 AC1.increaseTemp();
	 
	 AC1.decreaesTemp();
	 AC1.decreaesTemp();
	 AC1.decreaesTemp();
	 AC1.decreaesTemp();


	 System.out.println("Main Ended");
  }

}