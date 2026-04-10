// Autor: Tomasz Kreft s35510
//
// Zadanie 5
// Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer.
// Dodaj metody:
//
//  -	sum(), zwraca sumę liczb;
//  -	average(), zwraca średnią arytmetyczną liczb;
//  -	min(), zwraca najmniejszą z liczb;
//  -	max(), zwraca największą z liczb;
//  -	geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program.

public class Numbers {
    private int a;
    private int b;
    private int c;

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return a + b + c;
    }

    public double average() {
        return sum() / 3.0;
    }

    public int min() {
        return Math.min(a, Math.min(b, c));
    }

    public int max() {
        return Math.max(a, Math.max(b, c));
    }

    public double geometric() {
        return Math.cbrt((double) a * b * c);
    }
}