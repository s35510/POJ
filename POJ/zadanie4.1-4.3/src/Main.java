public class Main {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger(Severity.INFO);
        FileLogger fileLogger = new FileLogger(Severity.WARNING, "logi_sejfu.txt");

        Safe safe = new Safe("1234");

        SoundAlarm soundAlarm = new SoundAlarm();
        PoliceAlarm policeAlarm = new PoliceAlarm();
        BarsAlarm barsAlarm = new BarsAlarm();
        DogsAlarm dogsAlarm = new DogsAlarm();

        soundAlarm.setLogger(consoleLogger);
        policeAlarm.setLogger(fileLogger);
        barsAlarm.setLogger(consoleLogger);
        dogsAlarm.setLogger(fileLogger);

        safe.addAlarm(soundAlarm);
        safe.addAlarm(policeAlarm);

        System.out.println("TEST 1: Poprawny PIN, dwa alarmy");
        safe.enterPin("1234");

        System.out.println();

        System.out.println("TEST 2: Bledny PIN, dwa alarmy");
        safe.enterPin("9999");

        System.out.println();

        System.out.println("TEST 3: Dodanie kolejnych alarmow");
        safe.addAlarm(barsAlarm);
        safe.addAlarm(dogsAlarm);
        safe.enterPin("0000");

        System.out.println();

        System.out.println("TEST 4: Usuniecie alarmu policyjnego");
        safe.removeAlarm(policeAlarm);
        safe.enterPin("1111");

        System.out.println();

        System.out.println("TEST 5: Poprawny PIN po zmianie konfiguracji alarmow");
        safe.enterPin("1234");
    }
}