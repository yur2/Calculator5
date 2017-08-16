import java.util.Scanner;
public class Calculator_5 {
 static Scanner scan = new Scanner(System.in);

 public static void main(String []args) {
  
  Calculatorsub_5 calculatorsub = new Calculatorsub_5(0, scan);
  
  System.out.println("수를 입력하세용");
  calculatorsub.input(scan.nextInt());
     while(true) {
      
     System.out.println("연산자를 입력하세용");
     String temp = scan.next();
  calculatorsub.switch1(temp);
    
     
     }
  }
} 
 