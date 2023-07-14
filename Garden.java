class Garden{
  
  static String flowerNames[] = {null, null, null, null};
  static int index;
  
   public static boolean createFlowerNames(String flower){
	   boolean isCreated = false;
	   
	   if(flower != null){
		  flowerNames[index] = flower;
		  index++ ;
		   isCreated = true;
	   }else{
		   System.out.println("Cannot add flower, as it is a null value");
	   }
	   return isCreated;
   }
	
	public static void getAllFlowerNames(){
	System.out.println("Invoking getAllFlowerNames");
	
	   for(int flower=0 ; flower < flowerNames.length; flower++){
		   String reference = flowerNames[flower];
		   System.out.println(reference);
		   //System.out.println("Accessing flower " +reference+ " at " +flower);
	   }
	   System.out.println("end of getAllFlowerNames");
	}
	
	public static boolean updateFlowerName(String existingFlowerName, String updatedFlowerName){
	   System.out.println("Invoking updateFlowerName");
	   boolean isUpdated =false;
	   for(int flowerIndex = 0 ; flowerIndex < flowerNames.length; flowerIndex++){
		   if(flowerNames[flowerIndex].equals(existingFlowerName)){
			  flowerNames[flowerIndex] = updatedFlowerName;
              isUpdated = true;			  
		   }
	   }
       return isUpdated;
    } 
	
	public static int deleteFlowerName(String deletedFlowerName){
		 System.out.println("Invoking deleteFlowerName");
		 boolean isDeleted = false;
		 int flowerIndex;
		 int noOfElement = flowerNames.length;
		 for( flowerIndex = 0 ; flowerIndex < flowerNames.length; flowerIndex++){
		   if(flowerNames[flowerIndex].equals(deletedFlowerName)){
                break;			  
		   }
	   }
	     if(flowerIndex < noOfElement){
	     noOfElement = noOfElement-1;
		 for( int newFlowerIndex = flowerIndex ; newFlowerIndex < noOfElement; newFlowerIndex++){
			 flowerNames[newFlowerIndex] = flowerNames[newFlowerIndex+1];
		 } 
		 }
			   return noOfElement;
	 }
      
	  public static void getAllFlowerNamesPostDeletion(int newLength){
		  for(int flowerIndex=0 ; flowerIndex < newLength ; flowerIndex++){
			  System.out.println(flowerNames[flowerIndex]);
		  }
	  }
	  
	  public static String getAllFlowerNameByName(String flower){
	  System.out.println("Invoking getAllFlowerNameByName");
  	  System.out.println("No of parameter : 1, type String");
	  String sName = null;
      for (String name : flowerNames){
		  if(name.equals(flower)){
			  sName=name;
			  System.out.println("Item name found");
			  
		  }
	  }
		return sName;  
	  }
}


    