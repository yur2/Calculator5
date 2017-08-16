import java.util.ArrayList;
import java.util.Scanner;
public class Calculatorsub_5 {
 int a=0;
 int sum = 0;
 Scanner scan;
 
 public Calculatorsub_5(int a, Scanner scan){
  this.a = a;
  sum = a;
  this.scan =scan;
  
 }
 public void input(int a) {
  sum = a;
 }
 
 public void input2() {
  System.out.println("수를 입력하세용");
     a = scan.nextInt();
 }
 
 public void switch1(String temp) {
 
  
   switch(temp) {
   
 
    case "+":
       input2();
    sum = sum + this.a;
    break;
   case "-":
    input2();
    sum = sum - this.a;
    break;
   case "*":
    input2();
    sum = sum * this.a;
    break;
   case "/":
    input2();
    sum = sum / this.a;
    break;
   case "=":
    System.out.println("=" + sum);
    
    
   }
   
   
 }
}
 