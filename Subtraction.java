class Subtraction{
public static void main (String Subtraction[]){
 sub(45, 56);
 sub(87, 100);
 sub(97, 56);
 sub(117, 98);
 sub(292, 657);
 sub(89, 109);
 sub(118, 67);
 sub(26, 56);
 sub(67, 98);
 sub(293, 657);
 System.out.println("-------------");
 sub(45, 50, 55);
 sub(87, 60, 66);
 sub(97, 56, 45);
 sub(117, 98, 32);
 sub(292, 657, 22);
 sub(89, 109, 33);
 sub(418, 67, 13);
 sub(26, 56, 16);
 sub(87, 88, 19);
 sub(293, 657, 95);
}
 public static void sub(int x , int y){
  System.out.println(x-y);
  }
  
  public static void sub(int x , int y , int z){
  System.out.println(x-y-z);
  }


}