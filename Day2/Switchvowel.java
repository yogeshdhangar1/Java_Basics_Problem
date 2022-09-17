import java.util.*;
public class Switchvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the vowel contont");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'A' : System.out.println("A");
                        break;
            case 'B' : System.out.println("B");
                        break;
            case 'C' : System.out.println("C");
                break;
            case 'D' : System.out.println("D");
                break;
            default: System.out.println("Wrong Input");
        }
    }
}
