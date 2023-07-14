class TeleCommTester{
  public static void main (String sim[]){
	  TeleComm.createSimNames("Airtel");
	  TeleComm.createSimNames("Vodafone");
	  TeleComm.createSimNames("Jio");
	  TeleComm.createSimNames("BSNL");
      TeleComm.createSimNames("Tata Docomo");
      TeleComm.getAllSimNames();
  
     boolean isUpdated = TeleComm.updateSimName("Vodafone","Vi");
	 System.out.println("Is Sim Name updated " +isUpdated);
	 TeleComm.getAllSimNames();
	 
	 int newLength = TeleComm.deleteSimName("Tata Docomo");
	 System.out.println("Calling getAllSimNamesPostDeletion");
	 TeleComm.getAllSimNamesPostDeletion(newLength);
  }
}