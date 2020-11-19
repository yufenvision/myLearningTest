package java_base.time.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/18 13:02
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        // 1. 获取当前年月日 时分秒 -----打印输出----- 2018-01-29T21:23:26.774
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        // 2. 通过LocalDate和LocalTime构建 ----- 打印输出----- 2018-01-29T21:24:41.738
        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        // 3. 构建年月日 时分秒 -----打印输出----- 2018-01-29T19:23:13
        LocalDateTime localDateTime2 = LocalDateTime.of(2018, 01, 29, 19, 23, 13);
        // 4. 格式化当前时间 ----打印输出----- 2018/01/29
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(localDateTime2));

        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));

    }
}
