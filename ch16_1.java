import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ch16_1 {
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

for (Sensor sensor : sensors) {
    if (new HasAlarm().test(sensor)) {
        System.out.println("Alarm was triggered");
    }
    if (hasAlarmOrWarning.test(sensor)) {
        System.out.println("Alarm or warning was triggered");
    }
}

    }
}

    interface Sensor {
        int batteryHealth();
        void batteryHealth(int health);
        boolean triggered();
        void triggered(boolean state);
    }

    class Gateway implements Sensor {
        private int batteryHealth;
    private boolean triggered;

    public Gateway(int batteryHealth, boolean isTriggered) {
        this.batteryHealth = batteryHealth;
        this.triggered = isTriggered;
    }

    @Override
    public int batteryHealth() {
        return batteryHealth;
    }
    @Override
    public void batteryHealth(int health) {
        this.batteryHealth = health;
    }
    @Override
    public boolean triggered() {
        return triggered;
    }
    @Override
    public void triggered(boolean state) {
        triggered = state;
    }
    }

    class Fire implements Sensor {
        private int batteryHealth;
        private boolean triggered;
        private int temperature;
        public Fire(int batteryHealth, boolean isTriggered, int temperature) {
            this.batteryHealth = batteryHealth;
            this.triggered = isTriggered;
            this.temperature = temperature;
        }
        @Override
        public int batteryHealth() {
            return batteryHealth;
        }
        @Override
        public void batteryHealth(int health) {
            this.batteryHealth = health;
        }
        @Override
        public boolean triggered() {
            return triggered;
        }
        @Override
    public void triggered(boolean state) {
        triggered = state;
    }
    public int temperature() {
        return temperature;
    }
}


class Movement implements Sensor {
    private int batteryHealth;
    private boolean isTriggered;
    private int ambientLight;

    public Movement(int batteryHealth, boolean isTriggered, int ambientLight) {
        this.batteryHealth = batteryHealth;
        this.isTriggered = isTriggered;
        this.ambientLight = ambientLight;
    }

    @Override
    public int batteryHealth() {
        return batteryHealth;
    }
    @Override
    public void batteryHealth(int health) {
        this.batteryHealth = health;
    }
    @Override
    public boolean triggered() {
        return isTriggered;
    }
    @Override
    public void triggered(boolean state) {
        isTriggered = state;
    }
    public int ambientLight() {
        return ambientLight;
    }
}

class HasAlarm implements Predicate<Sensor> {
    @Override
    public boolean test(Sensor sensor) {
        return sensor.triggered();
    }
}
class HasWarning implements Predicate<Sensor> {
    public static final int BATTERY_WARNING = 10;
    @Override
    public boolean test(Sensor sensor) {
        return sensor.batteryHealth() < BATTERY_WARNING;
    }
}
