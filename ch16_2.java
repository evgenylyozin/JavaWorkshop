import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ch16_2 {

    static boolean alarmServiceNotified;
    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();
        sensors.add(new Gateway(34, false));
        sensors.add(new Gateway(14, true));
        sensors.add(new Gateway(74, false));
        sensors.add(new Gateway(8, false));
        sensors.add(new Gateway(18, false));
        sensors.add(new Gateway(9, false));

        Predicate<Sensor> hasAlarmOrWarning = new HasAlarm().or(new
HasWarning());
SendAlarm sendAlarm = new SendAlarm();
ResetAlarm resetAlarm = new ResetAlarm();

sensors.stream().filter(hasAlarmOrWarning).forEach(sendAlarm.andThen(resetAlarm));

if (alarmServiceNotified) {
    System.out.println("Alarm service notified");
}
if (sensors.stream().anyMatch(hasAlarmOrWarning.negate())) {
    System.out.println("Nothing was triggered");
}

    }
}


class SendAlarm implements Consumer<Sensor> {
    @Override
    public void accept(Sensor sensor) {
        if (sensor.triggered()) {
            ch16_2.alarmServiceNotified = true;
        }
    }
}

class ResetAlarm implements Consumer<Sensor> {
    @Override
    public void accept(Sensor sensor) {
        sensor.triggered(false);
        sensor.batteryHealth(50);
        ch16_2.alarmServiceNotified = false;
    }
}