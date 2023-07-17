class ToysTester{
    public static void main(String toy[]){
	System.out.println("Creating 1st copy of the Toys");
    Toys toys = new Toys();
	toys.name = "Remote Control Car";
	toys.price = 1000;
    toys.type = "Electronic";
    toys.color = "Red";
	toys.play();
	System.out.println(toys.name +" "+ toys.price + " " + toys.type + " " + toys.color);
	
	System.out.println("Creating 2nd copy of the Toys");
    Toys toys1 = new Toys();
	toys1.name = "Barbie Doll";
	toys1.price = 800;
    toys1.type = "Fashion Doll";
    toys1.color = "Pink";
	toys1.play();
	System.out.println(toys1.name +" "+ toys1.price + " " + toys1.type + " " + toys1.color);
	
	System.out.println("Creating 3rd copy of the Toys");
    Toys toys2 = new Toys();
	toys2.name = "Building Blocks";
	toys2.price = 1500;
    toys2.type = "Construction Set";
    toys2.color = "Assorted Colors";
	toys2.play();
	System.out.println(toys2.name +" "+ toys2.price + " " + toys2.type + " " + toys2.color);
	
	System.out.println("Creating 4th copy of the Toys");
    Toys toys3 = new Toys();
	toys3.name = "Hot Wheels Track Set";
	toys3.price = 600;
    toys3.type = "Toy Car Track";
    toys3.color = "Orange and Blue";
	toys3.play();
	System.out.println(toys3.name +" "+ toys3.price + " " + toys3.type + " " + toys3.color);

	System.out.println("Creating 5th copy of the Toys");
    Toys toys4 = new Toys();
	toys4.name = "Nerf N-Strike Elite Blaster";
	toys4.price = 1200;
    toys4.type = "Foam Dart Gun";
    toys4.color = "Blue and Orange";
	toys4.play();
	System.out.println(toys4.name +" "+ toys4.price + " " + toys4.type + " " + toys4.color);

    System.out.println("Creating 6th copy of the Toys");
    Toys toys5 = new Toys();
	toys5.name = "Fisher-Price Baby Play Gym";
	toys5.price = 1500;
    toys5.type = "Baby Activity Gym";
    toys5.color = "Multicolor";
	toys5.play();
	System.out.println(toys5.name +" "+ toys5.price + " " + toys5.type + " " + toys5.color);
	
	System.out.println("Creating 7th copy of the Toys");
    Toys toys6 = new Toys();
	toys6.name = "Dinosaur Action Figure Playset";
	toys6.price = 700;
    toys6.type = "Action Figure Set";
    toys6.color = "Green and Brown";
	toys6.play();
	System.out.println(toys6.name +" "+ toys6.price + " " + toys6.type + " " + toys6.color);
	
	System.out.println("Creating 8th copy of the Toys");
    Toys toys7 = new Toys();
	toys7.name = "My Little Pony Playset";
	toys7.price = 600;
    toys7.type = "Playset with Ponies";
    toys7.color = "Red";
	toys7.play();
	System.out.println(toys7.name +" "+ toys7.price + " " + toys7.type + " " + toys7.color);
	
	System.out.println("Creating 9th copy of the Toys");
    Toys toys8 = new Toys();
	toys8.name = "Puzzle Board Game";
	toys8.price = 800;
    toys8.type = "Brain Teaser Game";
    toys8.color = "Multicolor";
	toys8.play();
	System.out.println(toys8.name +" "+ toys8.price + " " + toys8.type + " " + toys8.color);
    
	
	System.out.println("Creating 10th copy of the Toys");
    Toys toys9 = new Toys();
	toys9.name = "Doctor Role Play Set";
	toys9.price = 500;
    toys9.type = "Pretend Play Set";
    toys9.color = "White and Blue";
	toys9.play();
	System.out.println(toys9.name +" "+ toys9.price + " " + toys9.type + " " + toys9.color);
	

}
}