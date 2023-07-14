class MedicalStore1Tester{
  public static void main (String medicine[]){
	  MedicalStore1.saveMedicineNames("Dolo 650");
	  MedicalStore1.saveMedicineNames("Astelin");
	  MedicalStore1.saveMedicineNames("Paracetamol");
	  MedicalStore1.saveMedicineNames("Amlodipine");
      MedicalStore1.saveMedicineNames("Cetirizine");
      MedicalStore1.saveMedicineNames("Losartan");
	  MedicalStore1.saveMedicineNames("Metformin");
	  MedicalStore1.saveMedicineNames("Codeine");
	  MedicalStore1.saveMedicineNames("Diphenhydramine");
      MedicalStore1.getAllMedicineNames();
	  
	 boolean isUpdated = MedicalStore1.updateMedicineName("Amlodipine","Atenolol");
	 System.out.println("Is Medicine Name updated " +isUpdated);
	 MedicalStore1.getAllMedicineNames();
	 
	 int newLength = MedicalStore1.deleteMedicineName("Dolo 650");
	 System.out.println("Calling getAllMedicineNamesPostDeletion");
	 MedicalStore1.getAllMedicineNamesPostDeletion(newLength);
  }
}