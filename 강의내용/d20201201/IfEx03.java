package d20201201;

public class IfEx03 {
   public static void main(String[] args) {
      int num1=-25;
      int num2=230;
      
      int big;
      
      //두 값중 큰 값을 구해보세요
      if(num1>num2) {
         big=num1;
      }else {
         big=num2;
      }
      //big=(num1>num2)?num1:num2;
      System.out.println(big);
      
      System.out.println("--------------------");
      
      //두 수 사이의 절대값을 구해보세요
      //절대값: 큰 수-작은 수 
      int dif;
      if(num1>num2) {		
         dif=num1-num2;
      }else {
         dif=num2-num1;
      }
      System.out.println(dif);
   }
}