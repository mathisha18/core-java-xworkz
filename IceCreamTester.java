class IceCreamTester{
  public static void main (String flavor[]){
	  IceCream.createFlavors("Vanilla");
	  IceCream.createFlavors("Chocolate");
	  IceCream.createFlavors("Strawberry");
	  IceCream.createFlavors("Vanilla Choco Chip");
      IceCream.createFlavors("Butterscotch");
      IceCream.createFlavors("Blueberry");
      IceCream.getAllFlavors();
	  
	 boolean isUpdated = IceCream.updateFlavor("Blueberry","Oreo Chip");
	 System.out.println("Is Flavor updated " +isUpdated);
	 IceCream.getAllFlavors();
	 
	 int newLength = IceCream.deleteFlavor("Strawberry");
	 System.out.println("Calling getAllFlavorsPostDeletion");
	 IceCream.getAllFlavorsPostDeletion(newLength);

  }
}