class MedicalStore1{
    static String medicineNames[] = {null, null, null, null, null, null, null, null, null};
	static int index;
	
	public static boolean saveMedicineNames(String medicine){
	boolean isSaved = false;
	   
	   if(medicine != null){
		  medicineNames[index] = medicine;
		  index++ ;
		   isSaved = true;
	   }else{
		   System.out.println("Cannot add medicine, as it is a null value");
	   }
	   return isSaved;
   }
	
	public static void getAllMedicineNames(){
	System.out.println("Invoking getAllMedicineNames");
	
	   for(int medicine=0 ; medicine < medicineNames.length; medicine++){
		   String reference = medicineNames[medicine];
		   System.out.println(reference);
		   //System.out.println("Accessing medicine " +reference+ " at " +medicine);
	   }
	   System.out.println("end of getAllMedicineNames");
	}
	
	public static boolean updateMedicineName(String existingMedicineName, String updatedMedicineName){
	   System.out.println("Invoking updateMedicineName");
	   boolean isUpdated =false;
	   for(int medicineIndex = 0 ; medicineIndex < medicineNames.length; medicineIndex++){
		   if(medicineNames[medicineIndex].equals(existingMedicineName)){
			  medicineNames[medicineIndex] = updatedMedicineName;
              isUpdated = true;			  
		   }
	   }
       return isUpdated;
    }
	
	public static int deleteMedicineName(String deletedMedicineName){
		 System.out.println("Invoking deleteMedicineName");
		 boolean isDeleted = false;
		 int medicineIndex;
		 int noOfElement = medicineNames.length;
		 for( medicineIndex = 0 ; medicineIndex < medicineNames.length; medicineIndex++){
		   if(medicineNames[medicineIndex].equals(deletedMedicineName)){
                break;			  
		   }
	   }
	     if(medicineIndex < noOfElement){
	     noOfElement = noOfElement-1;
		 for( int newMedicineIndex = medicineIndex ; newMedicineIndex < noOfElement; newMedicineIndex++){
			 medicineNames[newMedicineIndex] = medicineNames[newMedicineIndex+1];
		 } 
		 }
			   return noOfElement;
	 }
      
	public static void getAllMedicineNamesPostDeletion(int newLength){
		  for(int medicineIndex=0 ; medicineIndex < newLength ; medicineIndex++){
			  System.out.println(medicineNames[medicineIndex]);
		  }
	  }

}