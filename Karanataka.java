class Karanataka{
  
  static String cityNames[] = {null, null, null, null, null, null};
  static int index;
  
   public static boolean addCityNames(String city){
	   boolean isAdded = false;
	   if(index < cityNames.length){  // 5<6
	   if(city != null && city.length() > 0){
		  cityNames[index++] = city;
		   isAdded = true;
		   //System.out.println("City Added "+ isAdded);
	   }else{
		   System.out.println("Cannot add city, as it is a null value");
	   }
	   return isAdded;
   }else{
        System.out.println("Cannot add city");
   }
   return isAdded;
   }
	
	public static void getAllCityNames(){
	System.out.println("Invoking getAllCityNames");
	   for(String cityName : cityNames){
		   System.out.println(cityName);
	   }
	   /*for(int city=0 ; city < cityNames.length; city++){
		   String reference = cityNames[city];
		   System.out.println("Accessing city " +reference+ " at " +city);
	   }*/
	   System.out.println("end of getAllCityNames");
	}
	
	public static boolean updateCityName(String existingCityName, String updatedCityName){
	   System.out.println("Invoking updateCityName");
	   boolean isUpdated =false;
	   for(int cityIndex = 0 ; cityIndex < cityNames.length; cityIndex++){
		   if(cityNames[cityIndex].equals(existingCityName)){
			  cityNames[cityIndex] = updatedCityName;
              isUpdated = true;			  
		   }
	   }
       return isUpdated;
    }
	
	public static int deleteCityName(String deletedCityName){
		 System.out.println("Invoking deleteCityName");
		 boolean isDeleted = false;
		 int cityIndex;
		 int noOfElement = cityNames.length;
		 for( cityIndex = 0 ; cityIndex < cityNames.length; cityIndex++){
		   if(cityNames[cityIndex].equals(deletedCityName)){
                break;			  
		   }
	   }
	     if(cityIndex < noOfElement){
	     noOfElement = noOfElement-1;
		 for( int newCityIndex = cityIndex ; newCityIndex < noOfElement; newCityIndex++){
			 cityNames[newCityIndex] = cityNames[newCityIndex+1];
		 } 
		 }
			   return noOfElement;
	 }
      
	public static void getAllCityNamesPostDeletion(int newLength){
		  for(int cityIndex=0 ; cityIndex < newLength ; cityIndex++){
			  System.out.println(cityNames[cityIndex]);
		  }
	  }
	
}
