public class Jednoslad extends Pojazd {

    private TypJednosladu typ;

    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika,
                     RodzajSilnika rodzajSilnika,
                     double moc, double momentObrotowy,
                     TypJednosladu typ) {

        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typ = typ;
    }

    public Jednoslad(String marka, String nazwa, TypJednosladu typ) {
        super(marka, nazwa, 0, RodzajSilnika.ELEKTRYCZNY, 0, 0);
        this.typ = typ;
    }

    @Override
    public void wyswietl() {
        super.wyswietl();
        System.out.println("Typ: " + typ);
    }
}