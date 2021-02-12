package com.packtpub.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CoordScheduleTest {
    @Test
    @DisplayName("Frequency must be less than 1440")
    void testFrequency() {
        CoordSchedule schedule = new CoordSchedule(
                "2020-12-15T15:32Z",
                "2020-12-30T05:15Z",
                60
        );
        int frequency = schedule.getFrequency();
        Date starting = schedule.getStartingTimestampAsDate();
        Date ending = schedule.getEndingTimestampAsDate();

        // Timestamp is not formatted properly.
        Assertions.assertNotNull(starting);

        Assertions.assertNotNull(ending);
        Assertions.assertTrue(ending.after(starting));

        Assertions.assertTrue(frequency < CoordSchedule.MAX_FREQUENCY);
        Assertions.assertTrue(frequency > CoordSchedule.MIN_FREQUENCY);
    }
}
