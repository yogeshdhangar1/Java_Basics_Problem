import java .util.*;
public class ForLoopNaturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc .nextInt();
        int sum =0, count = 0;

        for(int i =0;i<=num;i++){
            sum = sum+i;
            count = count+1;
        }
        System.out.println("Enter the Nth number:"+sum);

    }
}
