import java.util.Scanner;

public class Main {
    public static double obliczWiek(double sekundy, String planeta) {
        double lataZiemskie = sekundy / 31557600.0;

        if (planeta.equalsIgnoreCase("Merkury")) {
            return lataZiemskie / 0.2408467;
        } else if (planeta.equalsIgnoreCase("Wenus")) {
            return lataZiemskie / 0.61519726;
        } else if (planeta.equalsIgnoreCase("Ziemia")) {
            return lataZiemskie;
        } else if (planeta.equalsIgnoreCase("Mars")) {
            return lataZiemskie / 1.8808158;
        } else if (planeta.equalsIgnoreCase("Jowisz")) {
            return lataZiemskie / 11.862615;
        } else if (planeta.equalsIgnoreCase("Saturn")) {
            return lataZiemskie / 29.447498;
        } else if (planeta.equalsIgnoreCase("Uran")) {
            return lataZiemskie / 84.016846;
        } else if (planeta.equalsIgnoreCase("Neptun")) {
            return lataZiemskie / 164.79132;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sekundy = sc.nextDouble();
        String planeta = sc.next();

        double wynik = obliczWiek(sekundy, planeta);

        if (wynik < 0) {
            System.out.println("BLAD");
        } else {
            System.out.printf("%.2f%n", wynik);
        }
    }
}