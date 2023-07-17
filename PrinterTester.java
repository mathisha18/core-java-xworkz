class PrinterTester{
    public static void main(String print[]){
	System.out.println("Creating 1st copy of the Printer");
    Printer printer = new Printer();
	printer.name = "HP DeskJet 2331 Printer";
	printer.price = 3500;
    printer.color = "White";
	printer.toPrint();
	System.out.println(printer.name +" "+ printer.price + " " + printer.color );

	System.out.println("Creating 2nd copy of the Printer");
    Printer printer1 = new Printer();
	printer1.name = "Canon PIXMA G2012 Ink Tank Printer";
	printer1.price = 15000;
    printer1.color = "Black";
	printer1.toPrint();
	System.out.println(printer1.name +" "+ printer1.price + " " + printer1.color );
	
	System.out.println("Creating 3rd copy of the Printer");
    Printer printer2 = new Printer();
	printer2.name = "Epson EcoTank L3150 Wi-Fi Printer";
	printer2.price = 13000;
    printer2.color = "Black";
	printer2.toPrint();
	System.out.println(printer2.name +" "+ printer2.price + " " + printer2.color );
	
	System.out.println("Creating 4th copy of the Printer");
    Printer printer3 = new Printer();
	printer3.name = "Brother HL-L2321D Monochrome Laser Printer";
	printer3.price = 8000;
    printer3.color = "Gray";
	printer3.toPrint();
	System.out.println(printer3.name +" "+ printer3.price + " " + printer3.color );

	System.out.println("Creating 5th copy of the Printer");
    Printer printer4 = new Printer();
	printer4.name = "Samsung Xpress M2071W Multifunction Printer";
	printer4.price = 10000;
    printer4.color = "White";
	printer4.toPrint();
	System.out.println(printer4.name +" "+ printer4.price + " " + printer4.color );
	
	System.out.println("Creating 6th copy of the Printer");
    Printer printer5 = new Printer();
	printer5.name = "Canon PIXMA G3000 Wireless Printer";
	printer5.price = 14000;
    printer5.color = "Black";
	printer5.toPrint();
	System.out.println(printer5.name +" "+ printer5.price + " " + printer5.color );
	
	System.out.println("Creating 7th copy of the Printer");
    Printer printer6 = new Printer();
	printer6.name = "HP LaserJet MFP M234sdwe Printer";
	printer6.price = 18000;
    printer6.color = "White";
	printer6.toPrint();
	System.out.println(printer6.name +" "+ printer6.price + " " + printer6.color );
	
	System.out.println("Creating 8th copy of the Printer");
    Printer printer7 = new Printer();
	printer7.name = "Epson EcoTank L3110 Printer";
	printer7.price = 11000;
    printer7.color = "Black";
	printer7.toPrint();
	System.out.println(printer7.name +" "+ printer7.price + " " + printer7.color );
	
	System.out.println("Creating 9th copy of the Printer");
    Printer printer8 = new Printer();
	printer8.name = "Brother DCP-T520W Ink Tank Printer";
	printer8.price = 15000;
    printer8.color = "Black";
	printer8.toPrint();
	System.out.println(printer8.name +" "+ printer8.price + " " + printer8.color );
	
	System.out.println("Creating 10th copy of the Printer");
    Printer printer9 = new Printer();
	printer9.name = "Samsung ProXpress M3371FD Laser Printer";
	printer9.price = 21000;
    printer9.color = "White";
	printer9.toPrint();
	System.out.println(printer9.name +" "+ printer9.price + " " + printer9.color );
	
	}
}
