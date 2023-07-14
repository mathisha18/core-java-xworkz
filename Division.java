class Division{
public static void main (String Division[]){
 div(51, 18);
 div(67, 8);
 div(97, 50);
 div(46, 9);
 div(176, 57);
 div(165, 29);
 div(254, 65);
 div(365, 56);
 div(154, 65);
 div(100, 97);
 System.out.println("-------------");
 div(151, 8, 1);
 div(67, 4, 7);
 div(97, 5, 2);
 div(46, 9, 5);
 div(176, 5, 4);
 div(165, 2, 2);
 div(254, 5, 3);
 div(365, 6, 5);
 div(154, 5, 6);
 div(100, 3, 8);
}
 public static void div(int u , int v){
  System.out.println(u/v);
  }
  
  public static void div(int u , int v , int w){
  System.out.println((u/v)/w);
  }


}