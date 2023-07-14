class Addition 
{
 //method
 public static void main(String addition[]){
 //invoke logic(addition)
 add(56,78);
 add(112,456);
 add(89,67);
 add(678,890);
 add(780,234);
 add(690,900);
 add(800,980);
 add(1000,90);
 add(908,809);
 add(756,863);
 //method overloading
 System.out.println("-------------");
 add(58,75,34);
 add(152,456,67);
 add(89,68,78);
 add(858,89,90);
 add(780,24,800);
 add(690,90,89);
 add(800,989,901);
 add(100,90,78);
 add(99,805,863);
 add(56,865,72);
 }
 
 //method
 public static void add(int z , int u) {     
 System.out.println(z+u);
 }
 public static void add(int z , int u , int y) {     
 System.out.println(z+u+y);
 }
}