class EarPhone{
    static String brandName ;
    static int price ;
    static String color;
    static boolean isVolumeButtonAvailable ;
	static String warranty;
	static String headPhonesJack ;
	static String noiseControl ;
  public static void main(String earphone[]){
      brandName = "Boat";
      price = 1200;
      color = "White";
      isVolumeButtonAvailable = true;
	  warranty = "1 yr";
	  headPhonesJack = "3.5mm";
	  noiseControl = "Sound isolation";
     
	  
	  System.out.println("The brandName is "+ brandName);
      System.out.println("The price is "+ price);
      System.out.println("The color is "+ color);
      System.out.println("Is volume button available "+ isVolumeButtonAvailable);
	  System.out.println("The warranty is "+ warranty);
	  System.out.println("The headPhonesJack is "+ headPhonesJack);
	  System.out.println("The noiseControl is "+ noiseControl);
     	 
  }
}