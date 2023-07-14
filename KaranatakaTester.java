class KaranatakaTester{
  public static void main (String karanataka[]){
	  Karanataka.addCityNames("Bangalore");
	  Karanataka.addCityNames("Mysore");
	  Karanataka.addCityNames("Mangalore");
	  Karanataka.addCityNames("Udupi");
      Karanataka.addCityNames("Hassan");
      Karanataka.addCityNames("Mandya");
	  Karanataka.addCityNames("Mandya");
      Karanataka.getAllCityNames();
	  
	 boolean isUpdated = Karanataka.updateCityName("Bangalore","Bengaluru");
	 System.out.println("Is City Name updated " +isUpdated);
	 Karanataka.getAllCityNames();
	 
	 int newLength = Karanataka.deleteCityName("Mysore");
	 System.out.println("Calling getAllCityNamesPostDeletion");
	 Karanataka.getAllCityNamesPostDeletion(newLength);

  }
}