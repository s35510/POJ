public class Zadanie05_04 {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle();
        MyRectangle rectangle2 = new MyRectangle(1, 1, 6, 4);
        MyRectangle rectangle3 = new MyRectangle(new MyPoint(2, 8), new MyPoint(10, 3));

        printRectangle(rectangle1);
        printRectangle(rectangle2);
        printRectangle(rectangle3);
    }

    private static void printRectangle(MyRectangle rectangle) {
        System.out.println(rectangle);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Diagonal: " + rectangle.getDiagonal());
        System.out.println();
    }
}