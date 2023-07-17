class SatelliteTester{
    public static void main(String sat[]){
	System.out.println("Creating 1st copy of the Satellite");
    Satellite satellite = new Satellite();
	satellite.name = "Aryabhata";
	satellite.year = 1975;
    satellite.purpose = "India's first satellite for experimental purposes";
	satellite.toDevelope();
	System.out.println(satellite.name +" "+ satellite.year + " " + satellite.purpose);
	
	System.out.println("Creating 2nd copy of the Satellite");
    Satellite satellite1 = new Satellite();
	satellite1.name = "INSAT-1A";
	satellite1.year = 1982;
    satellite1.purpose = "India's first multipurpose communication satellite for providing telecommunications";
	satellite1.toDevelope();
	System.out.println(satellite1.name +" "+ satellite1.year + " " + satellite1.purpose);
	
	System.out.println("Creating 3rd copy of the Satellite");
    Satellite satellite2 = new Satellite();
	satellite2.name = "IRS-1A";
	satellite2.year = 1988;
    satellite2.purpose = "Indian Remote Sensing satellite for Earth observation and mapping applications";
	satellite2.toDevelope();
	System.out.println(satellite2.name +" "+ satellite2.year + " " + satellite2.purpose);
	
	System.out.println("Creating 4th copy of the Satellite");
    Satellite satellite3 = new Satellite();
	satellite3.name = "INSAT-2E";
	satellite3.year = 1999;
    satellite3.purpose = "Communication satellite for providing services such as television broadcasting";
	satellite3.toDevelope();
	System.out.println(satellite3.name +" "+ satellite3.year + " " + satellite3.purpose);
	
	System.out.println("Creating 5th copy of the Satellite");
    Satellite satellite4 = new Satellite();
	satellite4.name = "Cartosat-1";
	satellite4.year = 2005;
    satellite4.purpose = "Earth observation satellite designed for cartographic applications, including mapping";
	satellite4.toDevelope();
	System.out.println(satellite4.name +" "+ satellite4.year + " " + satellite4.purpose);
	
	System.out.println("Creating 6th copy of the Satellite");
    Satellite satellite5 = new Satellite();
	satellite5.name = "Chandrayaan-1";
	satellite5.year = 2008;
    satellite5.purpose = "Lunar exploration mission aimed at studying the Moon's surface and conducting scientific experiments";
	satellite5.toDevelope();
	System.out.println(satellite5.name +" "+ satellite5.year + " " + satellite5.purpose);
	
	System.out.println("Creating 7th copy of the Satellite");
    Satellite satellite6 = new Satellite();
	satellite6.name = "RISAT-1";
	satellite6.year = 2012;
    satellite6.purpose = "Radar Imaging Satellite for all-weather surveillance and imaging of the Earth's surface";
	satellite6.toDevelope();
	System.out.println(satellite6.name +" "+ satellite6.year + " " + satellite6.purpose);
	
	System.out.println("Creating 8th copy of the Satellite");
    Satellite satellite7 = new Satellite();
	satellite7.name = "Mangalyaan";
	satellite7.year = 2013;
    satellite7.purpose = "Mars exploration mission to study the Martian atmosphere, surface, and climate";
	satellite7.toDevelope();
	System.out.println(satellite7.name +" "+ satellite7.year + " " + satellite7.purpose);

	System.out.println("Creating 9th copy of the Satellite");
    Satellite satellite8 = new Satellite();
	satellite8.name = "IRNSS-1I";
	satellite8.year = 2018;
    satellite8.purpose = "Navigation satellite as part of the Indian Regional Navigation Satellite System (IRNSS)";
	satellite8.toDevelope();
	System.out.println(satellite8.name +" "+ satellite8.year + " " + satellite8.purpose);
	
	System.out.println("Creating 10th copy of the Satellite");
    Satellite satellite9 = new Satellite();
	satellite9.name = "EMISAT";
	satellite9.year = 2019;
    satellite9.purpose = "Electronic Intelligence satellite designed for electromagnetic spectrum measurement and surveillance";
	satellite9.toDevelope();
	System.out.println(satellite9.name +" "+ satellite9.year + " " + satellite9.purpose);
	}
}