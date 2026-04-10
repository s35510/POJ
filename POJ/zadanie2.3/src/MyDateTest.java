public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(3, 21, 2026);
        MyDate date2 = new MyDate(12, 5, 2000);
        MyDate date3 = new MyDate(15, 40, 2080);

        date1.displayDate();
        date2.displayDate();
        date3.displayDate();
    }
}