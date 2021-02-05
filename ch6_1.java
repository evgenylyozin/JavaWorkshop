import java.time.*;

public class ch6_1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        DayOfWeek day = localDateTime.getDayOfWeek();

        System.out.println(day);
    }
}
