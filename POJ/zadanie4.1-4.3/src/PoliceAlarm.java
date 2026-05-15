public class PoliceAlarm implements Alarm {
    public Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Alarm policyjny: wysylanie patrolu policji.");

        if (logger != null) {
            logger.LogMessage(
                    Severity.ERROR,
                    EventSource.ALARM,
                    "Wezwano policje. Data: " + pinEvent.eventDate
            );
        }
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Alarm policyjny: odwolano wezwanie.");

        if (logger != null) {
            logger.LogMessage(
                    Severity.INFO,
                    EventSource.ALARM,
                    "Odwolano alarm policyjny. Data: " + pinEvent.eventDate
            );
        }
    }
}