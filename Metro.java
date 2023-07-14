class Metro{
  
  static String stationNames[] = {null, null, null, null, null, null, null};
  static int index;
  
   public static boolean createStationNames(String station){
	   boolean isCreated = false;
	   
	   if(station != null){
		  stationNames[index] = station;
		  index++ ;
		   isCreated = true;
	   }else{
		   System.out.println("Cannot add station, as it is a null value");
	   }
	   return isCreated;
   }
	
	public static void getAllStationNames(){
	System.out.println("Invoking getAllStationNames");
	
	   for(int station=0 ; station < stationNames.length; station++){
		   String reference = stationNames[station];
		   System.out.println(reference);
		   //System.out.println("Accessing station " +reference+ " at " +station);
	   }
	   System.out.println("end of getAllStationNames");
	}
	
	public static boolean updateStationName(String existingStationName, String updatedStationName){
	   System.out.println("Invoking updateStationName");
	   boolean isUpdated =false;
	   for(int stationIndex = 0 ; stationIndex < stationNames.length; stationIndex++){
		   if(stationNames[stationIndex].equals(existingStationName)){
			  stationNames[stationIndex] = updatedStationName;
              isUpdated = true;			  
		   }
	   }
       return isUpdated;
    }
	
	public static int deleteStationName(String deletedStationName){
		 System.out.println("Invoking deleteStationName");
		 boolean isDeleted = false;
		 int stationIndex;
		 int noOfElement = stationNames.length;
		 for( stationIndex = 0 ; stationIndex < stationNames.length; stationIndex++){
		   if(stationNames[stationIndex].equals(deletedStationName)){
                break;			  
		   }
	   }
	     if(stationIndex < noOfElement){
	     noOfElement = noOfElement-1;
		 for( int newStationIndex = stationIndex ; newStationIndex < noOfElement; newStationIndex++){
			 stationNames[newStationIndex] = stationNames[newStationIndex+1];
		 } 
		 }
			   return noOfElement;
	 }
      
	public static void getAllStationNamesPostDeletion(int newLength){
		  for(int stationIndex=0 ; stationIndex < newLength ; stationIndex++){
			  System.out.println(stationNames[stationIndex]);
		  }
	  }


}

