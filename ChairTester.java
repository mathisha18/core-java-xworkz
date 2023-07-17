class ChairTester{
   public static void main(String s[]){
   // object creation in java
   //ClassName referenceVariable= new ClassName();
   System.out.println("Creating 1st copy of the Chair");
   Chair chair = new Chair();
   chair.name = "Nirmala";
   chair.type = "plastic";
   chair.color = "cream";
   chair.price = 300.00;
   chair.toSit();
   System.out.println(chair.name +" "+ chair.type + " " + chair.color + " " + chair.price);
   
   System.out.println("Creating 2nd copy of the Chair");
   Chair chair1 = new Chair();
   chair1.name = "Nirmala";
   chair1.type = "steel";
   chair1.color = "black";
   chair1.price = 670.00;
   chair1.toSit();
   System.out.println(chair1.name +" "+ chair1.type + " " + chair1.color + " " + chair1.price);
   
   System.out.println("Creating 3rd copy of the Chair");
   Chair chair2 = new Chair();
   chair2.name = "Nirmala";
   chair2.type = "steel";
   chair2.color = "silver";
   chair2.price = 500.00;
   chair2.toSit();
   System.out.println(chair2.name +" "+ chair2.type + " " + chair2.color + " " + chair2.price);

   }
}
