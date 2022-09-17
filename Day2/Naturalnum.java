import java .util.*;
public class Naturalnum {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int i = 1,sum = 0;
        int count = 0 ;
        while(i<=num){
            sum = sum +i;
            i++;
        }
        System.out.println("Enter Nth number :"+sum);
    }
}
