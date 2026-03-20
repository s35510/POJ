import java.util.Scanner;

public class Main {
    public static int maksimum(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        }

        int max = maksimum(tab, n - 1);

        if (tab[n - 1] > max) {
            return tab[n - 1];
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        System.out.println(maksimum(tab, n));
    }
}