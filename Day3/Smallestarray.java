public class Smallestarray {
    public static void main(String[] args) {
      int [] arr = new int []{23,98,45,90,12};
      int min = arr[0];
      for(int i = 0;i<arr.length;i++){
          if(arr[i]<min){
              min = arr[i];
          }
      }
        System.out.println("Smallest element of array:"+min);
    }
}
