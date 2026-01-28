package DSA;
//
//import java.util.*;
//public class Main
//{
//public static void processArray(int[] arr)
//{
// for(int i=0; i< arr.length; i++)
//{
//boolean isWarm = Math.abs(arr[i]) % 10 == 2;
//boolean isCool = arr[i] % 8 == 0;
//
//if (isWarm && isCool)
//{
//arr[i] = -7;
//}
//else if (isWarm)
//{
//arr[i] = -2;
//} 
//else if (isCool)
//{
//arr[i] = -3;
//}
//}
//}
//
//public static void main(String[] args)
//{
//Scanner sc = new Scanner(System.in);
//List<Integer> list = new ArrayList<>();
//
//while (true)
//{
//int n = sc.nextInt();
//if (n < 0) break;
//list.add(n);
//}
//
//int[] arr = new int[list.size()];
//for (int i = 0; i < list.size(); i++)
//{
//arr[i] = list.get(i);
//}
//
//processArray(arr);
//for (int i = 0; i < arr.length; i++)
//{
//arr[i] -= 3;
//}
//}
//}
//
//


public class Main {

    public static void processArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            boolean isWarm = Math.abs(arr[i]) % 10 == 2;
            boolean isCool = arr[i] % 8 == 0;

            if (isWarm && isCool) {
                arr[i] = -7;
            } else if (isWarm) {
                arr[i] = -2;
            } else if (isCool) {
                arr[i] = -3;
            }
            // else: keep original value
        }
    }

    public static void main(String[] args) {

        // Input array (no Scanner)
        int[] arr = {92, 14, 80, 72};

        processArray(arr);

        // Output
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
