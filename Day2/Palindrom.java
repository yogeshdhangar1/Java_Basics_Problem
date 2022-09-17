import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int r,sum=0,temp;
        temp = num;
        while(num>0){
            r = num%10;
            num = num/10;
            sum = (sum*10)+r;
        }
        if(temp==sum){
            System.out.println("Palindrom");
        }else{
            System.out.println("not Palindrom");
        }
    }
}
