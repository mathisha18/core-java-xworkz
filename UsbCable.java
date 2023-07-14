class UsbCable{
	static String brandName ;
	static int price ;
    static String length ;
	static String connectorType ;
	static String cableType ;
	static String compatibleDevices ;
	static String compatiblePhoneModels ;
	static String chargingSpeed;
	static String warranty ; 
     
  public static void main(String cable[]){
      brandName = "Duracell";
      price = 379;
      length = "1.2m";
	  connectorType = "USB type A";
	  cableType = "USB";
	  compatibleDevices = "All type of C phones";
	  compatiblePhoneModels = "samsung";
	  chargingSpeed = "480mbps";
	  warranty = "3 years"; 
	  
	  System.out.println("The brandName is "+ brandName);
      System.out.println("The price is "+ price);
      System.out.println("The length is "+ length); 
	  System.out.println("The connectorType is "+ connectorType); 
	  System.out.println("The cableType is "+ cableType);
	  System.out.println("The compatibleDevices is "+ compatibleDevices); 
	  System.out.println("The compatiblePhoneModels is "+ compatiblePhoneModels); 
	  System.out.println("The chargingSpeed is "+ chargingSpeed); 
      System.out.println("The warranty is "+ warranty); 
	  
   
  }
}