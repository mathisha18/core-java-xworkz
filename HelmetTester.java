class HelmetTester{
    public static void main(String he[]){
	System.out.println("Creating 1st copy of the Helmet");
    Helmet helmet = new Helmet();
	helmet.name = "Steelbird SBA-1 Full-Face Helmet";
	helmet.price = 1500;
    helmet.color = "Black";
	helmet.forSafety();
	System.out.println(helmet.name +" "+ helmet.price + " " + helmet.color );

	System.out.println("Creating 2nd copy of the Helmet");
    Helmet helmet1 = new Helmet();
	helmet1.name = "Vega Crux Half-Face Helmet";
	helmet1.price = 800;
    helmet1.color = "Matte Black";
	helmet1.forSafety();
	System.out.println(helmet1.name +" "+ helmet1.price + " " + helmet1.color );
	
	System.out.println("Creating 3rd copy of the Helmet");
    Helmet helmet2 = new Helmet();
	helmet2.name = "Studds Ninja Elite Full-Face Helmet";
	helmet2.price = 1500;
    helmet2.color = "White";
	helmet2.forSafety();
	System.out.println(helmet2.name +" "+ helmet2.price + " " + helmet2.color );
	
	System.out.println("Creating 4th copy of the Helmet");
    Helmet helmet3 = new Helmet();
	helmet3.name = "SMK Twister Full-Face Helmet";
	helmet3.price = 2000;
    helmet3.color = "Red";
	helmet3.forSafety();
	System.out.println(helmet3.name +" "+ helmet3.price + " " + helmet3.color );
	
	System.out.println("Creating 5th copy of the Helmet");
    Helmet helmet4 = new Helmet();
	helmet4.name = "LS2 FF320 Strobe Full-Face Helmet";
	helmet4.price = 3500;
    helmet4.color = "Blue";
	helmet4.forSafety();
	System.out.println(helmet4.name +" "+ helmet4.price + " " + helmet4.color );
	
	System.out.println("Creating 6th copy of the Helmet");
    Helmet helmet5 = new Helmet();
	helmet5.name = "THH TX-26 Half-Face Helmet";
	helmet5.price = 1200;
    helmet5.color = "Silver";
	helmet5.forSafety();
	System.out.println(helmet5.name +" "+ helmet5.price + " " + helmet5.color );
	
	System.out.println("Creating 7th copy of the Helmet");
    Helmet helmet6 = new Helmet();
	helmet6.name = "HJC CS-15 Full-Face Helmet";
	helmet6.price = 2800;
    helmet6.color = "Glossy Black";
	helmet6.forSafety();
	System.out.println(helmet6.name +" "+ helmet6.price + " " + helmet6.color );
	
	System.out.println("Creating 8th copy of the Helmet");
    Helmet helmet7 = new Helmet();
	helmet7.name = "MT Thunder 3 SV Trace Full-Face Helmet";
	helmet7.price = 2500;
    helmet7.color = "Yellow";
	helmet7.forSafety();
	System.out.println(helmet7.name +" "+ helmet7.price + " " + helmet7.color );
	
	System.out.println("Creating 9th copy of the Helmet");
    Helmet helmet8 = new Helmet();
	helmet8.name = "Royal Enfield Open-Face Helmet";
	helmet8.price = 1300;
    helmet8.color = "Desert Sand";
	helmet8.forSafety();
	System.out.println(helmet8.name +" "+ helmet8.price + " " + helmet8.color );
	
	System.out.println("Creating 10th copy of the Helmet");
    Helmet helmet9 = new Helmet();
	helmet9.name = "Aerostar Shifter Full-Face Helmet";
	helmet9.price = 1900;
    helmet9.color = "Pink";
	helmet9.forSafety();
	System.out.println(helmet9.name +" "+ helmet9.price + " " + helmet9.color );
	}
}