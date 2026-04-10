// Autor: Tomasz Kreft s35510

// Zadanie 3
//
//Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year (type int).
// Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów (day 0-31, month 0-12, year 1990-2050).
// Zaimplementuj methody set i get dla wszystkich pól. Dodaj metodę displayDate, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone znakiem "/", np 21/03/2051.
// Przetestuj zaimplementowaną klasę.

public class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = 0;
        this.day = 0;
        this.year = 1990;

        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 0 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 0 && day <= 31) {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1990 && year <= 2050) {
            this.year = year;
        }
    }

    public void displayDate() {
        System.out.println(String.format("%02d/%02d/%04d", day, month, year));
    }
}