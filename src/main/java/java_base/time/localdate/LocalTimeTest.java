package java_base.time.localdate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * @Description: 只对时分秒纳秒做出处理
 * @Author: dyf
 * @Date: 2021/5/8 11:12
 */
public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(localTime.format(formatter));

    }
}
