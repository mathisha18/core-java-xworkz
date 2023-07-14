class TravelAgency{
   static String touristPlaces[] = {null, null, null, null, null, null, null, null};
   static int index;
   
   public static boolean saveTouristPlaces(String tourist){
	   boolean isSaved = false;
	   
	   if(tourist != null){
		  touristPlaces[index] = tourist;
		  index++ ;
		   isSaved = true;
	   }else{
		   System.out.println("Cannot add tourist, as it is a null value");
	   }
	   return isSaved;
   }
	
	public static void getAllTouristPlaces(){
	System.out.println("Invoking getAllTouristPlaces");
	
	   for(int tourist=0 ; tourist < touristPlaces.length; tourist++){
		   String reference = touristPlaces[tourist];
		   System.out.println(reference);
		   //System.out.println("Accessing tourist " +reference+ " at " +tourist);
	   }
	   System.out.println("end of getAllTouristPlaces");
	}
	
	public static boolean updateTouristPlace(String existingTouristPlace, String updatedTouristPlace){
	   boolean isUpdated =false;
	   for(int touristIndex = 0 ; touristIndex < touristPlaces.length; touristIndex++){
		   if(touristPlaces[touristIndex].equals(existingTouristPlace)){
			  touristPlaces[touristIndex] = updatedTouristPlace;
              isUpdated = true;			  
		   }
	   }
       return isUpdated;
    }
	
	public static int deleteTouristPlace(String deletedTouristPlace){
		 System.out.println("Invoking deleteTouristPlace");
		 boolean isDeleted = false;
		 int touristIndex;
		 int noOfElement = touristPlaces.length;
		 for( touristIndex = 0 ; touristIndex < touristPlaces.length; touristIndex++){
		   if(touristPlaces[touristIndex].equals(deletedTouristPlace)){
                break;			  
		   }
	   }
	     if(touristIndex < noOfElement){
	     noOfElement = noOfElement-1;
		 for( int newTouristIndex = touristIndex ; newTouristIndex < noOfElement; newTouristIndex++){
			 touristPlaces[newTouristIndex] = touristPlaces[newTouristIndex+1];
		 } 
		 }
			   return noOfElement;
	 }
      
	public static void getAllTouristPlacesPostDeletion(int newLength){
		  for(int touristIndex=0 ; touristIndex < newLength ; touristIndex++){
			  System.out.println(touristPlaces[touristIndex]);
		  }
	  }

}
