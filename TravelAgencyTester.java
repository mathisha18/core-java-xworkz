class TravelAgencyTester{
  public static void main (String tourist[]){
	  TravelAgency.saveTouristPlaces("Lalbagh Botanical Garden");
	  TravelAgency.saveTouristPlaces("ISKCON Temple");
	  TravelAgency.saveTouristPlaces("Cubbon Park");
	  TravelAgency.saveTouristPlaces("Bengaluru Palace");
      TravelAgency.saveTouristPlaces("Vidhana Soudha");
      TravelAgency.saveTouristPlaces("Wonderla Amusement Park");
	  TravelAgency.saveTouristPlaces("Nandi Hills");
	  TravelAgency.saveTouristPlaces("Commercial Street");
      TravelAgency.getAllTouristPlaces();
	  
	 boolean isUpdated = TravelAgency.updateTouristPlace("Commercial Street","Bannerghatta National Park");
	 System.out.println("Is Tourist Place updated " +isUpdated);
	 TravelAgency.getAllTouristPlaces();
	 
	 int newLength = TravelAgency.deleteTouristPlace("Lalbagh Botanical Garden");
	 System.out.println("Calling getAllTouristPlacesPostDeletion");
	 TravelAgency.getAllTouristPlacesPostDeletion(newLength);
  }
}