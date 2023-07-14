class Stationery {
  public static void main(String stationery[]){
  String items[]={"Books","Pens","Pencile","Scales","Erasers","Sharpners","Sketchpens","Glue Stick","Geometry Boxes","A4 Sheets","Color pencile"};
  System.out.println("Main started");
   /*for (int index=0; index <= items.length-1; index++ ){
   	System.out.println(items[index]);
   }*/
   getItems(items);
       System.out.println("Main ended"); 

  }
   public static void getItems(String items[]){
		System.out.println("Inside getItems");
		 for(String item:items){
			 System.out.println(item);
		 }
	}
}