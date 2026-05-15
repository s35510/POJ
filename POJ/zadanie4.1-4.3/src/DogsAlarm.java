public class DogsAlarm implements Alarm {
    public Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Alarm psow: psy zostaly wypuszczone.");

        if (logger != null) {
            logger.LogMessage(
                    Severity.ERROR,
                    EventSource.ALARM,
                    "Wypuszczono psy. Data: " + pinEvent.eventDate
            );
        }
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Alarm psow: psy zostaly odwolane.");

        if (logger != null) {
            logger.LogMessage(
                    Severity.INFO,
                    EventSource.ALARM,
                    "Odwolano psy. Data: " + pinEvent.eventDate
            );
        }
    }
}