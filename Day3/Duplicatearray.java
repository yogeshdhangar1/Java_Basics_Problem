public class Duplicatearray {
    public static void main(String[] args) {
        int arr [] = new int[]{1,4,5,6,79,1,4};
        System.out.println("Dublicate Array ");
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }

        }
    }
}
