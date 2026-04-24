public class Lokomotywa extends Maszyna {

    private int liczbaWagonow;
    private double masa;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika,
                      RodzajSilnika rodzajSilnika,
                      int liczbaWagonow, double masa) {

        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);

        this.liczbaWagonow = liczbaWagonow;
        this.masa = masa;
    }

    public void wyswietl() {
        System.out.println("Lokomotywa:");
        System.out.println(marka + " " + nazwa);
        System.out.println("Silnik: " + rodzajSilnika);
        System.out.println("Pojemnosc: " + pojemnoscSilnika);
        System.out.println("Wagony: " + liczbaWagonow);
        System.out.println("Masa: " + masa);
    }
}