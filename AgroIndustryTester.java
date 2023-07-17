class AgroIndustryTester{
    public static void main(String agro[]){
	System.out.println("Creating 1st copy of the AgroIndustry");
    AgroIndustry agroindustry = new AgroIndustry();
	agroindustry.name = "IFFCO (Indian Farmers Fertiliser Cooperative Limited)";
	agroindustry.fertilizerprice = 1000;
    agroindustry.fertilizer = "Urea";
	agroindustry.food();
	System.out.println(agroindustry.name +" "+ agroindustry.fertilizerprice + " " + agroindustry.fertilizer);
	
	System.out.println("Creating 2nd copy of the AgroIndustry");
    AgroIndustry agroindustry1 = new AgroIndustry();
	agroindustry1.name = "Krishak Bharati Cooperative Limited";
	agroindustry1.fertilizerprice = 500;
    agroindustry1.fertilizer = "DAP";
	agroindustry1.food();
	System.out.println(agroindustry1.name +" "+ agroindustry1.fertilizerprice + " " + agroindustry1.fertilizer);
	
	System.out.println("Creating 3rd copy of the AgroIndustry");
    AgroIndustry agroindustry2 = new AgroIndustry();
	agroindustry2.name = "National Fertilizers Limited";
	agroindustry2.fertilizerprice = 1500;
    agroindustry2.fertilizer = "NPK";
	agroindustry2.food();
	System.out.println(agroindustry2.name +" "+ agroindustry2.fertilizerprice + " " + agroindustry2.fertilizer);
	
	System.out.println("Creating 4th copy of the AgroIndustry");
    AgroIndustry agroindustry3 = new AgroIndustry();
	agroindustry3.name = "Rashtriya Chemicals & Fertilizers Ltd";
	agroindustry3.fertilizerprice = 500;
    agroindustry3.fertilizer = "Urea";
	agroindustry3.food();
	System.out.println(agroindustry3.name +" "+ agroindustry3.fertilizerprice + " " + agroindustry3.fertilizer);
	
	System.out.println("Creating 5th copy of the AgroIndustry");
    AgroIndustry agroindustry4 = new AgroIndustry();
	agroindustry4.name = "Tata Chemicals";
	agroindustry4.fertilizerprice = 1000;
    agroindustry4.fertilizer = "Bio-fertilizers";
	agroindustry4.food();
	System.out.println(agroindustry4.name +" "+ agroindustry4.fertilizerprice + " " + agroindustry4.fertilizer);
	
	System.out.println("Creating 6th copy of the AgroIndustry");
    AgroIndustry agroindustry5 = new AgroIndustry();
	agroindustry5.name = "Godrej Agrovet Limited";
	agroindustry5.fertilizerprice = 500 ;
    agroindustry5.fertilizer = "Bio-fertilizers";
	agroindustry5.food();
	System.out.println(agroindustry5.name +" "+ agroindustry5.fertilizerprice + " " + agroindustry5.fertilizer);
	
	System.out.println("Creating 7th copy of the AgroIndustry");
    AgroIndustry agroindustry6 = new AgroIndustry();
	agroindustry6.name = "National Fertilizer Limited ";
	agroindustry6.fertilizerprice = 2000;
    agroindustry6.fertilizer = "DAP";
	agroindustry6.food();
	System.out.println(agroindustry6.name +" "+ agroindustry6.fertilizerprice + " " + agroindustry6.fertilizer);
	
	System.out.println("Creating 8th copy of the AgroIndustry");
    AgroIndustry agroindustry7 = new AgroIndustry();
	agroindustry7.name = "Coromandel International Limited";
	agroindustry7.fertilizerprice = 200;
    agroindustry7.fertilizer = "Bio-fertilizers";
	agroindustry7.food();
	System.out.println(agroindustry7.name +" "+ agroindustry7.fertilizerprice + " " + agroindustry7.fertilizer);
	
	System.out.println("Creating 9th copy of the AgroIndustry");
    AgroIndustry agroindustry8 = new AgroIndustry();
	agroindustry8.name = "Tata Limited";
	agroindustry8.fertilizerprice = 3000;
    agroindustry8.fertilizer = "Bio-fertilizers";
	agroindustry8.food();
	System.out.println(agroindustry8.name +" "+ agroindustry8.fertilizerprice + " " + agroindustry8.fertilizer);
	
	System.out.println("Creating 10th copy of the AgroIndustry");
    AgroIndustry agroindustry9 = new AgroIndustry();
	agroindustry9.name = "Gujarat State Fertilizers & Chemicals";
	agroindustry9.fertilizerprice = 5000;
    agroindustry9.fertilizer = "Urea";
	agroindustry9.food();
	System.out.println(agroindustry9.name +" "+ agroindustry9.fertilizerprice + " " + agroindustry9.fertilizer);
	}
}