import java.util.ArrayList;

public class Safe {
    public ArrayList<Alarm> alarms;
    private String pin;

    public Safe(String pin) {
        this.pin = pin;
        this.alarms = new ArrayList<>();
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String enteredPin) {
        if (pin.equals(enteredPin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    private void wrongPin() {
        System.out.println("Podano bledny PIN.");

        PinEvent pinEvent = new PinEvent(this);

        for (Alarm alarm : alarms) {
            alarm.alarmTurnOn(pinEvent);
        }
    }

    private void correctPin() {
        System.out.println("Podano poprawny PIN. Sejf zostal otwarty.");

        PinEvent pinEvent = new PinEvent(this);

        for (Alarm alarm : alarms) {
            alarm.alarmTurnOff(pinEvent);
        }
    }
}