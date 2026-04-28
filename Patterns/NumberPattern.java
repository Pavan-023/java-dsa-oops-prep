package Patterns;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n + 1; i++) {
            if (i == 1 || i == 5) {
                for (int j = 1; j < n + 1; j++) {
                    System.out.print(1 + " ");
                }

            }
            System.out.println();

            if (i == 1 || i == 5) {
                System.out.print(1 + " ");
            }else{
                System.out.print(2+" ");
            }

        }
    }
}
