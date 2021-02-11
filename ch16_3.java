import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ch16_3 {

    static boolean alarmServiceNotified;
    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();
        sensors.add(new Gateway(34, false));
        sensors.add(new Gateway(14, true));
        sensors.add(new Fire(78, false, 21));
        sensors.add(new Gateway(74, false));
        sensors.add(new Gateway(8, false));
        sensors.add(new Movement(87, false, 45));
        sensors.add(new Gateway(18, false));
        sensors.add(new Fire(32, false, 23));
        sensors.add(new Gateway(9, false));
        sensors.add(new Movement(76, false, 41));
        ExtractBatteryHealth extractBatteryHealth = new
    ExtractBatteryHealth();
    Integer[] batteryHealths = sensors.stream().
    map(extractBatteryHealth).toArray(Integer[]::new);

    System.out.println(Arrays.toString(batteryHealths));
    }
}

class ExtractBatteryHealth implements Function<Sensor, Integer> {
    @Override
    public Integer apply(Sensor sensor) {
        return sensor.batteryHealth();
    }
}