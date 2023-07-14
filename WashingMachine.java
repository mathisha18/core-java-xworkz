class WashingMachine{
 static String brand;
 static String color;
 static int price;
 static String accessLocation ;
 static String model ;
 static String material ;
 static String capacity ;
 static String partNumber ;
 static boolean batteriesRequired;
 static String countryOfOrigin ;
 
 
 public static void main (String WashingMachine[]){
	 String brand = "IFB";
     String color = "grey";
     int price = 30000;
     String accessLocation = "frontload";
     String model = "NEO DIVA BXS 7010";
     String material = "stainless steel";
     String capacity = "7 kg";
     String partNumber = "IFBST18";
     boolean batteriesRequired = false;
     String countryOfOrigin = "India";


	 System.out.println("Main Started");
	 System.out.println("The brand is " + brand);
	 System.out.println("The color is " + color);
	 System.out.println("The price is " + price);
	 System.out.println("The accessLocation is " + accessLocation);
	 System.out.println("The model is " + model);
	 System.out.println("The material is " + material);
	 System.out.println("The capacity is " + capacity);
	 System.out.println("The partNumber is " + partNumber);
	 System.out.println("The batteriesRequired is " + batteriesRequired);
	 System.out.println("The countryOfOrigin is " + countryOfOrigin);
	 System.out.println("Main Ended");


}

}