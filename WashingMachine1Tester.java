class WashingMachine1Tester{
  public static void main(String test[]){
     System.out.println("Main Started");
     boolean connected = WashingMachine1.onOroff();
	 System.out.println("Is WashingMachine connected" + connected);
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 
	 WashingMachine1.decreaesSpeed();
	 WashingMachine1.decreaesSpeed();
	 WashingMachine1.decreaesSpeed();
	 WashingMachine1.decreaesSpeed();
	 
	 boolean connected1 = WashingMachine1.onOroff();
	 System.out.println("Is WashingMachine connected" + connected1);
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 
	 WashingMachine1.decreaesSpeed();
	 WashingMachine1.decreaesSpeed();
	 WashingMachine1.decreaesSpeed();
	 WashingMachine1.decreaesSpeed();


	 System.out.println("Main Ended");
  }

}