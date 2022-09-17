public class Operatorprob {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int result1 = a+b*c;
        System.out.println("result1 :"+result1);
        int result2 = c+a/b;
        System.out.println("result2:"+result2);
        int result3 = a%b+c;
        System.out.println("result3:"+result3);
        int result4 = a*b+c;
        System.out.println("result :"+result4);
        if((result1> result2)&&(result1> result3)&&(result1>result4)){
            System.out.println("result1 is greater:"+result1);
        }else if ((result2 > result1)&&(result2>result3)&&(result2 > result4)){
            System.out.println("result2 is greater:"+result2);
        }else if((result3>result1)&&(result3>result2)&&(result3>result4)){
            System.out.println("result3:"+result3);
        }else if((result4>result1)&&(result4>result2)&&(result4>result3)){
            System.out.println("result4 is :"+result4);
        }
    }
}
