public class ArrayFrequancy {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 6, 2, 7, 8};
        int[] visitedarr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visitedarr[j] = visited;
                }
            }
            if (visitedarr[i] != visited) {
                visitedarr[i] = count;
            }
        }
            for (int i = 0; i < visitedarr[i]; i++) {
                if (visitedarr[i] != visited) {
                    System.out.println("frequancy:"+arr[i]+" :"+visitedarr[i]);
                }
            }
        }
    }

