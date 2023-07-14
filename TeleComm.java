class TeleComm{
  
  static String simNames[] = {null, null, null, null, null};
  static int index;
  
   public static boolean createSimNames(String sim){
	   boolean isCreated = false;
	   
	   if(sim != null){
		  simNames[index] = sim;
		  index++ ;
		   isCreated = true;
	   }else{
		   System.out.println("Cannot add sim, as it is a null value");
	   }
	   return isCreated;
   }
	
	public static void getAllSimNames(){
	System.out.println("Invoking getAllSimNames");
	
	   for(int sim=0 ; sim < simNames.length; sim++){
		   String reference = simNames[sim];
		   System.out.println(reference);
		   //System.out.println("Accessing sim " +reference+ " at " +sim);
	   }
	   System.out.println("end of getAllSimNames");
	}
	
	public static boolean updateSimName(String existingSimName, String updatedSimName){
	   System.out.println("Invoking updateSimName");
	   boolean isUpdated =false;
	   for(int simIndex = 0 ; simIndex < simNames.length; simIndex++){
		   if(simNames[simIndex].equals(existingSimName)){
			  simNames[simIndex] = updatedSimName;
              isUpdated = true;			  
		   }
	   }
       return isUpdated;
    }
	
	public static int deleteSimName(String deletedSimName){
		 System.out.println("Invoking deleteSimName");
		 boolean isDeleted = false;
		 int simIndex;
		 int noOfElement = simNames.length;
		 for( simIndex = 0 ; simIndex < simNames.length; simIndex++){
		   if(simNames[simIndex].equals(deletedSimName)){
                break;			  
		   }
	   }
	     if(simIndex < noOfElement){
	     noOfElement = noOfElement-1;
		 for( int newSimIndex = simIndex ; newSimIndex < noOfElement; newSimIndex++){
			 simNames[newSimIndex] = simNames[newSimIndex+1];
		 } 
		 }
			   return noOfElement;
	 }
      
	  public static void getAllSimNamesPostDeletion(int newLength){
		  for(int simIndex=0 ; simIndex < newLength ; simIndex++){
			  System.out.println(simNames[simIndex]);
		  }
	  }

}

