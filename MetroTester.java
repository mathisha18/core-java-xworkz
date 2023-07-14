class MetroTester{
  public static void main (String station[]){
	  Metro.createStationNames("Vijayanagar");
	  Metro.createStationNames("Attiguppe");
	  Metro.createStationNames("Deepanjali Nagar");
	  Metro.createStationNames("Mysore Road");
      Metro.createStationNames("Nayandahalli");
      Metro.createStationNames("Magadi Road");
	  Metro.createStationNames("Majestic");
      Metro.getAllStationNames();
  
     boolean isUpdated = Metro.updateStationName("Majestic","Nadaprabhu Kempegowda station, Majestic");
	 System.out.println("Is Station Name updated " +isUpdated);
	 Metro.getAllStationNames();
	 
	 int newLength = Metro.deleteStationName("Mysore Road");
	 System.out.println("Calling getAllStationNamesPostDeletion");
	 Metro.getAllStationNamesPostDeletion(newLength);
  }
}