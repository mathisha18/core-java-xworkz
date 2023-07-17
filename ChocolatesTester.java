class ChocolatesTester{
    public static void main(String choco[]){
	System.out.println("Creating 1st copy of the Chocolates");
    Chocolates chocolates = new Chocolates();
	chocolates.name = "Cadbury Dairy Milk";
	chocolates.flavor = "Milk Chocolate";
    chocolates.price = 20;
    chocolates.quantity = "50g";
	chocolates.expDate = "2023-12-31";
	chocolates.mgfDate = "2023-07-01";
	chocolates.toGetColories();
	System.out.println(chocolates.name +" "+ chocolates.flavor + " " + chocolates.price + " " + chocolates.quantity + " " + chocolates.expDate + " " + chocolates.mgfDate);

	System.out.println("Creating 2nd copy of the Chocolates");
    Chocolates chocolates1 = new Chocolates();
	chocolates1.name = "Amul Dark Chocolate";
	chocolates1.flavor = "Dark Chocolate";
    chocolates1.price = 25;
    chocolates1.quantity = "40g";
	chocolates1.expDate = "2024-02-28";
	chocolates1.mgfDate = "2023-10-15";
	chocolates1.toGetColories();
	System.out.println(chocolates1.name +" "+ chocolates1.flavor + " " + chocolates1.price + " " + chocolates1.quantity + " " + chocolates1.expDate + " " + chocolates1.mgfDate);

	System.out.println("Creating 3rd copy of the Chocolates");
    Chocolates chocolates2 = new Chocolates();
	chocolates2.name = "KitKat";
	chocolates2.flavor = "Wafer and Milk Chocolate";
    chocolates2.price = 10;
    chocolates2.quantity = "35g";
	chocolates2.expDate = "2023-11-30";
	chocolates2.mgfDate = "2023-06-05";
	chocolates2.toGetColories();
	System.out.println(chocolates2.name +" "+ chocolates2.flavor + " " + chocolates2.price + " " + chocolates2.quantity + " " + chocolates2.expDate + " " + chocolates2.mgfDate);

	System.out.println("Creating 4th copy of the Chocolates");
    Chocolates chocolates3 = new Chocolates();
	chocolates3.name = "Ferrero Rocher";
	chocolates3.flavor = "nut and Chocolate";
    chocolates3.price = 150;
    chocolates3.quantity = "200g";
	chocolates3.expDate = "2024-05-31";
	chocolates3.mgfDate = "2023-12-15";
	chocolates3.toGetColories();
	System.out.println(chocolates3.name +" "+ chocolates3.flavor + " " + chocolates3.price + " " + chocolates3.quantity + " " + chocolates3.expDate + " " + chocolates3.mgfDate);
	
	System.out.println("Creating 5th copy of the Chocolates");
    Chocolates chocolates4 = new Chocolates();
	chocolates4.name = "Bournville Rich Cocoa";
	chocolates4.flavor = "Dark Chocolate";
    chocolates4.price = 30;
    chocolates4.quantity = "80g";
	chocolates4.expDate = "2023-10-31";
	chocolates4.mgfDate = "2023-04-20";
	chocolates4.toGetColories();
	System.out.println(chocolates4.name +" "+ chocolates4.flavor + " " + chocolates4.price + " " + chocolates4.quantity + " " + chocolates4.expDate + " " + chocolates4.mgfDate);
	
	System.out.println("Creating 6th copy of the Chocolates");
    Chocolates chocolates5 = new Chocolates();
	chocolates5.name = "Mars";
	chocolates5.flavor = "Milk Chocolate and Caramel";
    chocolates5.price = 15;
    chocolates5.quantity = "51g";
	chocolates5.expDate = "2024-03-31";
	chocolates5.mgfDate = "2023-12-05";
	chocolates5.toGetColories();
	System.out.println(chocolates5.name +" "+ chocolates5.flavor + " " + chocolates5.price + " " + chocolates5.quantity + " " + chocolates5.expDate + " " + chocolates5.mgfDate);
	
	System.out.println("Creating 7th copy of the Chocolates");
    Chocolates chocolates6 = new Chocolates();
	chocolates6.name = "Galaxy Smooth Milk";
	chocolates6.flavor = "Milk Chocolate";
    chocolates6.price = 35;
    chocolates6.quantity = "100g";
	chocolates6.expDate = "2024-01-31";
	chocolates6.mgfDate = "2023-09-10";
	chocolates6.toGetColories();
	System.out.println(chocolates6.name +" "+ chocolates6.flavor + " " + chocolates6.price + " " + chocolates6.quantity + " " + chocolates6.expDate + " " + chocolates6.mgfDate);

	System.out.println("Creating 8th copy of the Chocolates");
    Chocolates chocolates7 = new Chocolates();
	chocolates7.name = "Perk";
	chocolates7.flavor = "Milk Chocolate and Crispy Rice";
    chocolates7.price = 5;
    chocolates7.quantity = "15g";
	chocolates7.expDate = "2023-09-30";
	chocolates7.mgfDate = "2023-05-20";
	chocolates7.toGetColories();
	System.out.println(chocolates7.name +" "+ chocolates7.flavor + " " + chocolates7.price + " " + chocolates7.quantity + " " + chocolates7.expDate + " " + chocolates7.mgfDate);
	
	System.out.println("Creating 9th copy of the Chocolates");
    Chocolates chocolates8 = new Chocolates();
	chocolates8.name = "Lindt Excellence";
	chocolates8.flavor = "Cocoa Dark Chocolate";
    chocolates8.price = 100;
    chocolates8.quantity = "100g";
	chocolates8.expDate = "2024-04-30";
	chocolates8.mgfDate = "2023-12-01";
	chocolates8.toGetColories();
	System.out.println(chocolates8.name +" "+ chocolates8.flavor + " " + chocolates8.price + " " + chocolates8.quantity + " " + chocolates8.expDate + " " + chocolates8.mgfDate);
	
	System.out.println("Creating 10th copy of the Chocolates");
    Chocolates chocolates9 = new Chocolates();
	chocolates9.name = "Toblerone";
	chocolates9.flavor = "Milk Chocolate with Honey";
    chocolates9.price = 80;
    chocolates9.quantity = "100g";
	chocolates9.expDate = "2024-07-15";
	chocolates9.mgfDate = "2024-01-15";
	chocolates9.toGetColories();
	System.out.println(chocolates9.name +" "+ chocolates9.flavor + " " + chocolates9.price + " " + chocolates9.quantity + " " + chocolates9.expDate + " " + chocolates9.mgfDate);
}

}
