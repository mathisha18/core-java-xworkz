class ShipTester{
    public static void main(String travel[]){
	System.out.println("Creating 1st copy of the Ship");
    Ship ship = new Ship();
	ship.name = "MV Ocean Cargo";
	ship.price = 2500;
    ship.fromplace = "Mumbai";
	ship.toplace = "Singapore";
	ship.toTravel();
	System.out.println(ship.name +" "+ ship.price + " " + ship.fromplace + " " + ship.toplace);
	
	System.out.println("Creating 2nd copy of the Ship");
    Ship ship1 = new Ship();
	ship1.name = "SS India Star";
	ship1.price = 5000;
    ship1.fromplace = "Chennai";
	ship1.toplace = "Dubai";
	ship1.toTravel();
	System.out.println(ship1.name +" "+ ship1.price + " " + ship1.fromplace + " " + ship1.toplace);
	
	System.out.println("Creating 3rd copy of the Ship");
    Ship ship2 = new Ship();
	ship2.name = "MV Blue Horizon";
	ship2.price = 6000;
    ship2.fromplace = "Kolkata";
	ship2.toplace = "Colombo";
	ship2.toTravel();
	System.out.println(ship2.name +" "+ ship2.price + " " + ship2.fromplace + " " + ship2.toplace);
	
	System.out.println("Creating 4th copy of the Ship");
    Ship ship3 = new Ship();
	ship3.name = "SS Golden Gate";
	ship3.price = 5000;
    ship3.fromplace = "Colombo";
	ship3.toplace = "Kolkata";
	ship3.toTravel();
	System.out.println(ship3.name +" "+ ship3.price + " " + ship3.fromplace + " " + ship3.toplace);
	
	System.out.println("Creating 5th copy of the Ship");
    Ship ship4 = new Ship();
	ship4.name = "MV Arabian Sea";
	ship4.price = 3000;
    ship4.fromplace = "Cochin";
	ship4.toplace = "ebel Ali, UAE";
	ship4.toTravel();
	System.out.println(ship4.name +" "+ ship4.price + " " + ship4.fromplace + " " + ship4.toplace);
	
	System.out.println("Creating 6th copy of the Ship");
    Ship ship5 = new Ship();
	ship5.name = "SS Pacific Explorer";
	ship5.price = 5000;
    ship5.fromplace = "Tuticorin";
	ship5.toplace = "Malaysia";
	ship5.toTravel();
	System.out.println(ship5.name +" "+ ship5.price + " " + ship5.fromplace + " " + ship5.toplace);
	
	System.out.println("Creating 7th copy of the Ship");
    Ship ship6 = new Ship();
	ship6.name = "MV Bay of Bengal";
	ship6.price = 2000;
    ship6.fromplace = "Mangalore";
	ship6.toplace = "Bangladesh";
	ship6.toTravel();
	System.out.println(ship6.name +" "+ ship6.price + " " + ship6.fromplace + " " + ship6.toplace);
	
	System.out.println("Creating 8th copy of the Ship");
    Ship ship7 = new Ship();
	ship7.name = "SS Andaman Princess";
	ship7.price = 3500;
    ship7.fromplace = "Paradip";
	ship7.toplace = "Myanmar";
	ship7.toTravel();
	System.out.println(ship7.name +" "+ ship7.price + " " + ship7.fromplace + " " + ship7.toplace);
	
	System.out.println("Creating 9th copy of the Ship");
    Ship ship8 = new Ship();
	ship8.name = "MV Eastern Star";
	ship8.price = 5000;
    ship8.fromplace = "Kandla";
	ship8.toplace = "Oman";
	ship8.toTravel();
	System.out.println(ship8.name +" "+ ship8.price + " " + ship8.fromplace + " " + ship8.toplace);
	
	System.out.println("Creating 10th copy of the Ship");
    Ship ship9 = new Ship();
	ship9.name = "SS Western Glory";
	ship9.price = 3000;
    ship9.fromplace = "Singapore";
	ship9.toplace = "Mumbai";
	ship9.toTravel();
	System.out.println(ship9.name +" "+ ship9.price + " " + ship9.fromplace + " " + ship9.toplace);
	
	}
}