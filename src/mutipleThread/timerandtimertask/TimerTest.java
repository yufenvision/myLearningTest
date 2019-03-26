package mutipleThread.timerandtimertask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * 需求：在指定的时间删除我们指定的目录(你可以指定c盘，但是我不建议，我使用项目路径下的demo)
 *
 */
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		
		Timer t = new Timer();
		
		String s = "2018-08-13 16:13:00";
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sm.parse(s);
		
		t.schedule(new DeleteFolder("demo",t), d);
	}
}



