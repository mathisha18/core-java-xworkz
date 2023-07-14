class IceCream{
  
  static String flavors[] = {null, null, null, null, null, null};
  static int index;
  
   public static boolean createFlavors(String flavor){
	   //System.out.println("Invoking createFlavors");
	   boolean isCreated = false;
	   if(index < flavors.length){
	   if(flavor != null){
		  flavors[index] = flavor;
		  index++ ;
		   isCreated = true;
	   }else{
		   System.out.println("Cannot add flavor, as it is a null value");
	   }
	   return isCreated;
	   }else{
		  System.out.println("Cannot add flavor");
	   }
	   return isCreated;
   }
	
	public static void getAllFlavors(){
	System.out.println("Invoking getAllFlavors");
	
	   for(int flavor=0 ; flavor < flavors.length; flavor++){
		   String reference = flavors[flavor];
		   System.out.println(reference);
		   //System.out.println("Accessing flavor " +reference+ " at " +flavor);
	   }
	   System.out.println("end of getAllFlavors");
	}
	
	public static boolean updateFlavor(String existingFlavor, String updatedFlavor){
		System.out.println("Invoking updateFlavor");
	   boolean isUpdated =false;
	   for(int flavorIndex = 0 ; flavorIndex < flavors.length; flavorIndex++){
		   if(flavors[flavorIndex].equals(existingFlavor)){
			  flavors[flavorIndex] = updatedFlavor;
              isUpdated = true;			  
		   }
	   }
       return isUpdated;
    }
	
     public static int deleteFlavor(String deletedFlavor){
		 System.out.println("Invoking deleteFlavor");
		 boolean isDeleted = false;
		 int flavorIndex;
		 int noOfElement = flavors.length;
		 for( flavorIndex = 0 ; flavorIndex < flavors.length; flavorIndex++){
		   if(flavors[flavorIndex].equals(deletedFlavor)){
			  //flavors[flavorIndex] = null;
              //isDeleted = true;	
                break;			  
		   }
	   }
	     if(flavorIndex < noOfElement){
	     noOfElement = noOfElement-1;
		 for( int newFlavorIndex = flavorIndex ; newFlavorIndex < noOfElement; newFlavorIndex++){
			 flavors[newFlavorIndex] = flavors[newFlavorIndex+1];
		 } 
		 }
			   return noOfElement;
	 }
      
	  public static void getAllFlavorsPostDeletion(int newLength){
		  for(int flavorIndex=0 ; flavorIndex < newLength ; flavorIndex++){
			  System.out.println(flavors[flavorIndex]);
		  }
	  }
		 
	 

    }

