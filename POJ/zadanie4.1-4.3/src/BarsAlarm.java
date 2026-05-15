public class BarsAlarm implements Alarm {
    public Logger logger;

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        System.out.println("Alarm krat: kraty zostaly opuszczone.");

        if (logger != null) {
            logger.LogMessage(
                    Severity.WARNING,
                    EventSource.ALARM,
                    "Opuszczono kraty. Data: " + pinEvent.eventDate
            );
        }
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        System.out.println("Alarm krat: kraty zostaly podniesione.");

        if (logger != null) {
            logger.LogMessage(
                    Severity.INFO,
                    EventSource.ALARM,
                    "Podniesiono kraty. Data: " + pinEvent.eventDate
            );
        }
    }
}