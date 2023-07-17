class DoorTester{
    public static void main(String d[]){
	System.out.println("Creating 1st copy of the Door");
    Door door = new Door();
	door.name = "Wooden Main Door";
	door.price = 15000;
    door.size = "7 feet (height) x 3 feet (width)";
	door.color = "Dark Brown";
	door.forSafety();
	System.out.println(door.name +" "+ door.price + " " + door.size + " " + door.color);

	System.out.println("Creating 2nd copy of the Door");
    Door door1 = new Door();
	door1.name = "Fiberglass Entry Door";
	door1.price = 20000;
    door1.size = "8 feet (height) x 4 feet (width)";
	door1.color = "White";
	door1.forSafety();
	System.out.println(door1.name +" "+ door1.price + " " + door1.size + " " + door1.color);
	
	System.out.println("Creating 3rd copy of the Door");
    Door door2 = new Door();
	door2.name = "Steel Security Door";
	door2.price = 12000;
    door2.size = "6.5 feet (height) x 3 feet (width)";
	door2.color = "Gray";
	door2.forSafety();
	System.out.println(door2.name +" "+ door2.price + " " + door2.size + " " + door2.color);

	System.out.println("Creating 4th copy of the Door");
    Door door3 = new Door();
	door3.name = "PVC Bathroom Door";
	door3.price = 4000;
    door3.size = "6.5 feet (height) x 2.5 feet (width)";
	door3.color = "Cream";
	door3.forSafety();
	System.out.println(door3.name +" "+ door3.price + " " + door3.size + " " + door3.color);
	
	System.out.println("Creating 5th copy of the Door");
    Door door4 = new Door();
	door4.name = "Aluminum Sliding Patio Door";
	door4.price = 25000;
    door4.size = "7 feet (height) x 5 feet (width)";
	door4.color = "Black";
	door4.forSafety();
	System.out.println(door4.name +" "+ door4.price + " " + door4.size + " " + door4.color);
	
	System.out.println("Creating 6th copy of the Door");
    Door door5 = new Door();
	door5.name = "Glass French Door";
	door5.price = 30000;
    door5.size = "8 feet (height) x 6 feet (width)";
	door5.color = "Transparent";
	door5.forSafety();
	System.out.println(door5.name +" "+ door5.price + " " + door5.size + " " + door5.color);

	System.out.println("Creating 7th copy of the Door");
    Door door6 = new Door();
	door6.name = "UPVC Folding Door";
	door6.price = 18000;
    door6.size = "7 feet (height) x 4 feet (width)";
	door6.color = "Brown";
	door6.forSafety();
	System.out.println(door6.name +" "+ door6.price + " " + door6.size + " " + door6.color);
	
	System.out.println("Creating 8th copy of the Door");
    Door door7 = new Door();
	door7.name = "Flush Interior Door";
	door7.price = 14000;
    door7.size = "7 feet (height) x 3 feet (width)";
	door7.color = "Walnut";
	door7.forSafety();
	System.out.println(door7.name +" "+ door7.price + " " + door7.size + " " + door7.color);
	
	System.out.println("Creating 9th copy of the Door");
    Door door8 = new Door();
	door8.name = "Laminated Bedroom Door";
	door8.price = 10000;
    door8.size = "6.5 feet (height) x 2.5 feet (width)";
	door8.color = "Teak";
	door8.forSafety();
	System.out.println(door8.name +" "+ door8.price + " " + door8.size + " " + door8.color);
	
	System.out.println("Creating 10th copy of the Door");
    Door door9 = new Door();
	door9.name = "Veneer Finish Door";
	door9.price = 14000;
    door9.size = "7 feet (height) x 3 feet (width)";
	door9.color = "Walnut";
	door9.forSafety();
	System.out.println(door9.name +" "+ door9.price + " " + door9.size + " " + door9.color);
	
	
	}
}