public class Evenarray {
    public static void main(String[] args) {
        int [] arr = new int[]{12,65,98,45};
        System.out.println("Even numbers");
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd numbers");
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }

    }
}
