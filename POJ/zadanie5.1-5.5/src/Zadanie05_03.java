public class Zadanie05_03 {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(2, 0), new MyPoint(1, 2));
        MyTriangle triangle3 = new MyTriangle(0, 0, 2, 0, 1, 1);

        printTriangle(triangle1);
        printTriangle(triangle2);
        printTriangle(triangle3);
    }

    private static void printTriangle(MyTriangle triangle) {
        System.out.println(triangle);
        System.out.println("Obwod: " + triangle.getPerimeter());
        System.out.println("Typ: " + triangle.getType());
        System.out.println();
    }
}