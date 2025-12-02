package DSA;

public class RotateMatrix {

    public static void rotate(int[][] mat) {
        int n = mat.length;

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // reverse each row
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int t = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = t;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        rotate(mat);

        for (int[] row : mat)
            System.out.println(java.util.Arrays.toString(row));
    }
}
