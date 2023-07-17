class BarTester{
    public static void main(String b[]){
	System.out.println("Creating 1st copy of the Bar");
    Bar bar = new Bar();
	bar.name = "Vodka";
	bar.price = 1000;
    bar.size = "500ml";
	bar.todestroy();
	//System.out.println(bar.name +" "+ bar.price + " " + bar.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
    System.out.println("---------------------------------");
	
	System.out.println("Creating 2nd copy of the Bar");
    //Bar bar1 = new Bar();
	bar.name = "gin";
	bar.price = 500;
    bar.size = "100ml";
	bar.todestroy();
	//System.out.println(bar1.name +" "+ bar1.price + " " + bar1.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
    System.out.println("---------------------------------");
	
	System.out.println("Creating 3rd copy of the Bar");
    //Bar bar2 = new Bar();
	bar.name = "baijiu";
	bar.price = 600;
    bar.size = "100ml";
	bar.todestroy();
	//System.out.println(bar2.name +" "+ bar2.price + " " + bar2.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
    System.out.println("---------------------------------");
	
	System.out.println("Creating 4th copy of the Bar");
    //Bar bar3 = new Bar();
	bar.name = "shochu";
	bar.price = 720;
    bar.size = "250ml";
	bar.todestroy();
	//System.out.println(bar3.name +" "+ bar3.price + " " + bar3.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
    System.out.println("---------------------------------");
	
	System.out.println("Creating 5th copy of the Bar");
    //Bar bar4 = new Bar();
	bar.name = "tequila";
	bar.price = 500;
    bar.size = "100ml";
	bar.todestroy();
	//System.out.println(bar4.name +" "+ bar4.price + " " + bar4.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
    System.out.println("---------------------------------");
	
	System.out.println("Creating 6th copy of the Bar");
    //Bar bar5 = new Bar();
	bar.name = "soju";
	bar.price = 500;
    bar.size = "100ml";
	bar.todestroy();
	//System.out.println(bar5.name +" "+ bar5.price + " " + bar5.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
    System.out.println("---------------------------------");
	
	System.out.println("Creating 7th copy of the Bar");
    //Bar bar6 = new Bar();
	bar.name = "Beer";
	bar.price = 200;
    bar.size = "500ml";
	bar.todestroy();
	//System.out.println(bar6.name +" "+ bar6.price + " " + bar6.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
    System.out.println("---------------------------------");
	
	System.out.println("Creating 8th copy of the Bar");
    Bar bar7 = new Bar();
	bar7.name = "brandy";
	bar7.price = 1000;
    bar7.size = "750ml";
	bar7.todestroy();
	System.out.println(bar7.name +" "+ bar7.price + " " + bar7.size);
	
	System.out.println("Creating 9th copy of the Bar");
    //Bar bar8 = new Bar();
	bar.name = "rum";
	bar.price = 1500;
    bar.size = "750ml";
	bar.todestroy();
	//System.out.println(bar8.name +" "+ bar8.price + " " + bar8.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
    System.out.println("---------------------------------");
	
	System.out.println("Creating 10th copy of the Bar");
    //Bar bar9 = new Bar();
	bar.name = "whisky";
	bar.price = 1000;
    bar.size = "500ml";
	bar.todestroy();
	//System.out.println(bar9.name +" "+ bar9.price + " " + bar9.size);
	System.out.println(bar.name);
    System.out.println(bar.price);
    System.out.println(bar.size);
	}
}
