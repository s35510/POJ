import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tekst = sc.nextLine();

        boolean[] litery = new boolean[26];

        tekst = tekst.toLowerCase();

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (znak >= 'a' && znak <= 'z') {
                litery[znak - 'a'] = true;
            }
        }

        int pangram = 1;

        for (int i = 0; i < 26; i++) {
            if (litery[i] == false) {
                pangram = 0;
            }
        }

        if (pangram == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}