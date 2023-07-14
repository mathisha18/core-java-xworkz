class Modulus{
public static void main (String Modulus[]){
 mod(75, 86);
 mod(37, 10);
 mod(97, 50);
 mod(17, 98);
 mod(982, 65);
 mod(89, 229);
 mod(118, 657);
 mod(590, 56);
 mod(87, 29);
 mod(99, 97);
 System.out.println("-------------");
 mod(75, 86, 68);
 mod(37, 10, 20);
 mod(97, 50, 60);
 mod(17, 98, 22);
 mod(982, 657, 658);
 mod(89, 229, 65);
 mod(118, 657, 75);
 mod(590, 56, 60);
 mod(87, 29, 20);
 mod(99, 97, 88);
}
 public static void mod(int x , int y){
  System.out.println(x%y);
  }
 public static void mod(int x , int y , int z){
  System.out.println((x%y)%z);
  }

}