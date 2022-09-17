import java .util.*;
public class Forlopreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int r,sum=0, count = 0;
        for(int i =0;i<num;i++){
            r = num%10;
            num = num/10;
            sum = (sum*10)+r;
            count = count -1;
        }
        System.out.println("Enter the reverse number:"+sum);
    }
}
