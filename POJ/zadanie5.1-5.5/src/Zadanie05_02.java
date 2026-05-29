import java.util.Arrays;

public class Zadanie05_02 {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(3, 4, 5);
        MyCircle circle3 = new MyCircle(new MyPoint(8, 10), 2);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println("Promien circle2: " + circle2.getRadius());
        System.out.println("Srodek circle2: " + circle2.getCenter());
        System.out.println("Wspolrzedne srodka circle2: " + Arrays.toString(circle2.getCenterXY()));
        System.out.println("Pole circle2: " + circle2.getArea());
        System.out.println("Obwod circle2: " + circle2.getCircumference());
        System.out.println("Odleglosc circle2 od circle3: " + circle2.distance(circle3));

        circle2.setCenterXY(1, 1);
        circle2.setRadius(10);
        System.out.println("Po zmianie: " + circle2);
    }
}