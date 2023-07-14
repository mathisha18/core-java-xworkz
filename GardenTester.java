class GardenTester{
  public static void main (String garden[]){
	  Garden.createFlowerNames("Rose");
	  Garden.createFlowerNames("Lily");
	  Garden.createFlowerNames("Jasmine");
	  Garden.createFlowerNames("Lavender");
      Garden.getAllFlowerNames();
	  
	 boolean isUpdated = Garden.updateFlowerName("Lavender","Mari Gold");
	 System.out.println("Is Flower Name updated " +isUpdated);
	 Garden.getAllFlowerNames();
	 
	 String sName = Garden.getAllFlowerNameByName("Lily");
	 System.out.println("The searched item name is : " + sName);
	 
	 int newLength = Garden.deleteFlowerName("Rose");
	 System.out.println("Calling getAllFlowerPostDeletion");
	 Garden.getAllFlowerNamesPostDeletion(newLength);
  }
}