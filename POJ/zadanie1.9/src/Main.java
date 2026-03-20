import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] tab = new char[100];
        String slowo = sc.next();

        int dlugosc = slowo.length();

        for (int i = 0; i < dlugosc; i++) {
            tab[i] = slowo.charAt(i);
        }

        int palindrom = 1;

        for (int i = 0; i < dlugosc / 2; i++) {
            if (tab[i] != tab[dlugosc - 1 - i]) {
                palindrom = 0;
            }
        }

        if (palindrom == 1) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}