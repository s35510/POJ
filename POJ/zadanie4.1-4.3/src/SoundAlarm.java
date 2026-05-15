public class SoundAlarm implements Alarm {
    public Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Alarm dzwiekowy: WEEE-OOO-WEEE-OOO!");

        if (logger != null) {
            logger.LogMessage(
                    Severity.WARNING,
                    EventSource.ALARM,
                    "Uruchomiono alarm dzwiekowy. Data: " + pinEvent.eventDate
            );
        }
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Alarm dzwiekowy zostal wylaczony.");

        if (logger != null) {
            logger.LogMessage(
                    Severity.INFO,
                    EventSource.ALARM,
                    "Wylaczono alarm dzwiekowy. Data: " + pinEvent.eventDate
            );
        }
    }
}