class MiPowerBank{
    static String connectorType ;
	static String brand ;
	static String batteryCapacity ;
	static int price ;
	static String color ;
	static String specialFeature ;
	static String compatiblePhoneModels;
	static String ports ;
	static String timeOfCharging ;
	static String warranty ;
  public static void main(String powerbank[]){
      connectorType = "USB, Micro USB";
	  brand = "MI";
	  batteryCapacity = "1000 Milliamp Hours";
	  price = 1600;
	  color = "Black";
	  specialFeature = "fast charging";
	  compatiblePhoneModels = "Smartphones";
	  ports = "dual";
	  timeOfCharging = "6.9 hours";
	  warranty = "6 months";
     
	 
	 
	 System.out.println("The connectorType is "+ connectorType);
	 System.out.println("The brand is "+ brand);
	 System.out.println("The batteryCapacity is "+ batteryCapacity);
	 System.out.println("The price is "+ price);
	 System.out.println("the color is "+ color);
	 System.out.println("the specialFeature is "+ specialFeature);
	 System.out.println("the ports is "+ ports);
	 System.out.println("the compatiblePhoneModels is "+ compatiblePhoneModels);
	 System.out.println("the timeOfCharging is "+ timeOfCharging);
	 System.out.println("the warranty is "+ warranty);
	 
     	 
  }
}