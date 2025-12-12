package DSA;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3; 
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int last = arr[n-1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        for (int a : arr) System.out.print(a + " ");
    }
}

