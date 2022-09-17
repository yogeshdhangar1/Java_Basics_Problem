import java.util.*;
class Leapyear{
 public static void main (String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter the year");
 int y = sc.nextInt();
 if(y%100 ){
 System.out.println(y+ "Leap year" );
 }else{ 
	  System.out.println(y+ "Not leap Year");
 }else if(y%400==0){
   System.out.println(y+ "its  leap Year");
}
}
 }

  
 
