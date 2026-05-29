public class Zadanie05_01 {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        for (MyPoint point : points) {
            System.out.println(point);
        }

        MyPoint point = new MyPoint(3, 4);
        System.out.println("Punkt testowy: " + point);
        System.out.println("Odleglosc od (0,0): " + point.distance());
        System.out.println("Odleglosc od (7,7): " + point.distance(7, 7));
    }
}
