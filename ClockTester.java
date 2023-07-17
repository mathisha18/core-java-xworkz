class ClockTester{
    public static void main(String time[]){
	System.out.println("Creating 1st copy of the Clock");
    Clock clock = new Clock();
	clock.name = "Seiko Wall Clock";
	clock.price = 1500;
    clock.size = "12 inches";
	clock.color = "Black";
	clock.toKnowTime();
	System.out.println(clock.name +" "+ clock.price + " " + clock.size + " " + clock.color);

	System.out.println("Creating 2nd copy of the Clock");
    Clock clock1 = new Clock();
	clock1.name = "Ajanta Analog Table Clock";
	clock1.price = 800;
    clock1.size = "6 inches";
	clock1.color = "White";
	clock1.toKnowTime();
	System.out.println(clock1.name +" "+ clock1.price + " " + clock1.size + " " + clock1.color);
	
	System.out.println("Creating 3rd copy of the Clock");
    Clock clock2 = new Clock();
	clock2.name = "Casio Digital Alarm Clock";
	clock2.price = 1000;
    clock2.size = "4 inches";
	clock2.color = "Silver";
	clock2.toKnowTime();
	System.out.println(clock2.name +" "+ clock2.price + " " + clock2.size + " " + clock2.color);
	
	System.out.println("Creating 4th copy of the Clock");
    Clock clock3 = new Clock();
	clock3.name = "Rhythm Musical Wall Clock";
	clock3.price = 2500;
    clock3.size = "14 inches";
	clock3.color = "Brown";
	clock3.toKnowTime();
	System.out.println(clock3.name +" "+ clock3.price + " " + clock3.size + " " + clock3.color);

	System.out.println("Creating 5th copy of the Clock");
    Clock clock4 = new Clock();
	clock4.name = "Havells Decorative Pendulum Clock";
	clock4.price = 2000;
    clock4.size = "18 inches";
	clock4.color = "Gold";
	clock4.toKnowTime();
	System.out.println(clock4.name +" "+ clock4.price + " " + clock4.size + " " + clock4.color);
	
	System.out.println("Creating 6th copy of the Clock");
    Clock clock5 = new Clock();
	clock5.name = "Citizen Table Clock";
	clock5.price = 1300;
    clock5.size = "8 inches";
	clock5.color = "Silver";
	clock5.toKnowTime();
	System.out.println(clock.name +" "+ clock.price + " " + clock.size + " " + clock.color);
	
	System.out.println("Creating 7th copy of the Clock");
    Clock clock6 = new Clock();
	clock6.name = "Panasonic Digital LED Alarm Clock";
	clock6.price = 1200;
    clock6.size = "5 inches";
	clock6.color = "Blue";
	clock6.toKnowTime();
	System.out.println(clock6.name +" "+ clock6.price + " " + clock6.size + " " + clock6.color);
	
	System.out.println("Creating 8th copy of the Clock");
    Clock clock7 = new Clock();
	clock7.name = "Orpat Quartz Round Wall Clock";
	clock7.price = 700;
    clock7.size = "10 inches";
	clock7.color = "Red";
	clock7.toKnowTime();
	System.out.println(clock7.name +" "+ clock7.price + " " + clock7.size + " " + clock7.color);

	System.out.println("Creating 9th copy of the Clock");
    Clock clock8 = new Clock();
	clock8.name = "Opal Decorative Cuckoo Clock";
	clock8.price = 3000; 
    clock8.size = "16 inches";
	clock8.color = "Green";
	clock8.toKnowTime();
	System.out.println(clock8.name +" "+ clock8.price + " " + clock8.size + " " + clock8.color);
	
	System.out.println("Creating 10th copy of the Clock");
    Clock clock9 = new Clock();
	clock9.name = "Timex Retro Flip Clock";
	clock9.price = 1800;
    clock9.size = "9 inches";
	clock9.color = "Black and White";
	clock9.toKnowTime();
	System.out.println(clock9.name +" "+ clock9.price + " " + clock9.size + " " + clock9.color);
	
	}
}