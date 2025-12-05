package DSA;

public class CountCase {
    public static void main(String[] args) {
        String s = "JaVaProGRam";
        int upper = 0, lower = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }

        System.out.println("Upper: " + upper + " Lower: " + lower);
    }
}
