package tdd.args2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: dyf
 * @Date: 2019/8/18 10:49
 * @Description: 解析命令行
 */
public class CommandTest {
    @Test
    public void test_getStringValueByCommand(){
        Command command = new Command("-l -p 8080 -d /usr/logs -g this,is,a,list -D 1,2,-3,5");
        assertEquals("true", command.getValue("l"));
        assertEquals("8080", command.getValue("p"));
        assertEquals("/usr/logs", command.getValue("d"));
        assertEquals("this,is,a,list", command.getValue("g"));
        assertEquals("1,2,-3,5", command.getValue("D"));

    }

}
