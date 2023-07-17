class BeveragesTester{
    public static void main(String softdrinks[]){
	System.out.println("Creating 1st copy of the Beverages");
    Beverages beverages = new Beverages();
	beverages.name = "Coca-Cola";
	beverages.price = 70;
    beverages.size = "2.5liter";
	beverages.toGetColories();
	System.out.println(beverages.name +" "+ beverages.price + " " + beverages.size);

	System.out.println("Creating 2nd copy of the Beverages");
    Beverages beverages1 = new Beverages();
	beverages1.name = "Pepsi";
	beverages1.price = 20;
    beverages1.size = "300ml";
	beverages1.toGetColories();
	System.out.println(beverages1.name +" "+ beverages1.price + " " + beverages1.size);
	
	System.out.println("Creating 3rd copy of the Beverages");
    Beverages beverages2 = new Beverages();
	beverages2.name = "Fanta";
	beverages2.price = 35;
    beverages2.size = "500ml";
	beverages2.toGetColories();
	System.out.println(beverages2.name +" "+ beverages2.price + " " + beverages2.size);
	
	System.out.println("Creating 4th copy of the Beverages");
    Beverages beverages3 = new Beverages();
	beverages3.name = "Mountain Dew";
	beverages3.price = 25;
    beverages3.size = "300ml";
	beverages3.toGetColories();
	System.out.println(beverages3.name +" "+ beverages3.price + " " + beverages3.size);
	
	System.out.println("Creating 5th copy of the Beverages");
    Beverages beverages4 = new Beverages();
	beverages4.name = "Mountain Dew";
	beverages4.price = 90;
    beverages4.size = "2.5liter";
	beverages4.toGetColories();
	System.out.println(beverages4.name +" "+ beverages4.price + " " + beverages4.size);
	
	System.out.println("Creating 6th copy of the Beverages");
    Beverages beverages5 = new Beverages();
	beverages5.name = "Sprite";
	beverages5.price = 70;
    beverages5.size = "1liter";
	beverages5.toGetColories();
	System.out.println(beverages5.name +" "+ beverages5.price + " " + beverages5.size);
	
	System.out.println("Creating 7th copy of the Beverages");
    Beverages beverages6 = new Beverages();
	beverages6.name = "Mirinda";
	beverages6.price = 70;
    beverages6.size = "1.5liter";
	beverages6.toGetColories();
	System.out.println(beverages6.name +" "+ beverages6.price + " " + beverages6.size);
	
	System.out.println("Creating 8th copy of the Beverages");
    Beverages beverages7 = new Beverages();
	beverages7.name = "Appy Fizz";
	beverages7.price = 25;
    beverages7.size = "500ml";
	beverages7.toGetColories();
	System.out.println(beverages7.name +" "+ beverages7.price + " " + beverages7.size);
	
	System.out.println("Creating 9th copy of the Beverages");
    Beverages beverages8 = new Beverages();
	beverages8.name = "Maaza Mango Juice";
	beverages8.price = 30;
    beverages8.size = "400ml";
	beverages8.toGetColories();
	System.out.println(beverages8.name +" "+ beverages8.price + " " + beverages8.size);
	
	System.out.println("Creating 10th copy of the Beverages");
    Beverages beverages9 = new Beverages();
	beverages9.name = "Limca";
	beverages9.price = 20;
    beverages9.size = "250ml";
	beverages9.toGetColories();
	System.out.println(beverages9.name +" "+ beverages9.price + " " + beverages9.size);
	}
}