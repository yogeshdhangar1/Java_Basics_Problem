public class Reversearray {
    public static void main(String[] args) {
        int arr[] = new int[]{7,5,78,98};
        System.out.println("Original Array");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse Array");
        for(int i =arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }
}
