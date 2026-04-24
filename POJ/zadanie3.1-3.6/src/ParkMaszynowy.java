import java.util.*;

public class ParkMaszynowy {
    public static void main(String[] args) {

        Lokomotywa l1 = new Lokomotywa("Pafawag", "ET22", 3000, RodzajSilnika.ELEKTRYCZNY, 20, 120);
        Lokomotywa l2 = new Lokomotywa("Fablok", "SM42", 81600, RodzajSilnika.SPALINOWY, 30, 150);

        Kosiarka k1 = new Kosiarka("Parkside", "PERM 1300 A1", 1300, RodzajSilnika.ELEKTRYCZNY, true, true, 2);
        Kosiarka k2 = new Kosiarka("Alpina", "BL410", 123, RodzajSilnika.SPALINOWY, false, true, 3);

        Samochod s1 = new Samochod("BMW", "X5", 3000, RodzajSilnika.SPALINOWY, 300, 500, Segment.D, "VIN1");
        Samochod s2 = new Samochod("Audi", "A3", 2000, RodzajSilnika.HYBRYDOWY, 200, 300, Segment.C, "VIN2");

        Jednoslad j1 = new Jednoslad("Kross", "Hexagon", TypJednosladu.ROWER);
        Jednoslad j2 = new Jednoslad("Yamaha", "R1", 1000, RodzajSilnika.SPALINOWY, 200, 180, TypJednosladu.MOTOR);

        List<Maszyna> lista = new ArrayList<>();

        lista.add(l1);
        lista.add(l2);
        lista.add(k1);
        lista.add(k2);
        lista.add(s1);
        lista.add(s2);
        lista.add(j1);
        lista.add(j2);

        for (Maszyna m : lista) {
            m.wyswietl();
            System.out.println("------");
        }

        k1.setLiczbaOstrzy(5);
        k1.wyswietl();
    }
}