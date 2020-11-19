package java_base.time.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/18 13:04
 */
public class Date2LocalDateTest {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("current date: " + date);

        // Date -> LocalDateTime
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime by Instant: " + localDateTime);

        // Date -> LocalDate
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("localDate by Instant: " + localDate);
        // Date -> LocalTime
        LocalTime localTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        System.out.println("localTime by Instant: " + localTime);

        //2. Date -> LocalDateTime
        localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println("localDateTime by ofInstant: " + localDateTime);

    }
}
