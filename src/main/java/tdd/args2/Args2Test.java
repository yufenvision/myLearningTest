package tdd.args2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @Author: dyf
 * @Date: 2019/8/17 09:51
 * @Description:
 *  * 初始需求:
 * 我们经常会遇到需要解析命令行参数的场景。如果没有趁手的工具，我们可以自己写一个，自己想办法处理传给main函数的参数。
 * 传入一个程序的参数包含了“标记”（flag）和“值”（value）。标记都是一个字母，前面加上“-”号（例如“-p”这样）。每个标记可以有一个值与之对应，也可以没有对应的值。
 * 我们要开发一个解析器（parser）来处理这些参数。这个解析器需要一个参数结构（schema）来描述“这个程序应该接受哪些参数”的信息，包括：
 * 应该有几个标记；
 * 每个标记应该是什么类型；
 * 每个标记的缺省值是什么。
 * 参数结构指定好以后，就可以把实际接收到的参数列表传给参数解析器。解析器会首先验证参数列表是否与参数结构相匹配。然后，程序就可以向参数解析器查询每个参数的值（根据参数的标记名）。返回值的类型应该与参数结构中规定的类型相一致。
 * 例如，程序接收到的参数是这样：
 * -l -p 8080 -d /usr/logs
 * 那么对应的参数结构应该规定3个标记：l、p、d
 * l（logging，是否记录日志）标记没有与之对应的值，这是一个布尔型的标记，如果传入了“-l”就为True，否则为False。
 * p（port，端口号）标记的值是整数型。
 * d（directory，目录）标记的值是字符串型。
 * 如果参数结构中规定了的标记在实际的参数列表中没有出现，那么就应该返回合理的缺省值，例如布尔型的缺省值可以是False，数值型的缺省值可以是0，字符串型的缺省值可以是空字符串。
 * 如果实际给出的参数与参数结构不匹配，需要给出良好的错误信息，解释清楚出错的原因。
 *
 * 扩展需求:
 * 扩展代码，支持列表类型的参数。例如下列参数中：
 * -g this,is,a,list -d 1,2,-3,5
 * g标记对应的是字符串类型的列表（[“this”, “is”, “a”, “list”]），d标记对应的是整数类型的列表（[1, 2, -3, 5]）。
 * 代码应该具有良好的可扩展性，这样在添加新的值类型时才会简单明了。
 */
//@RunWith(Parameterized.class)
public class Args2Test {
    /**
     * Schemas解析：
     *      Bool
     *      字符串
     *      int
     * Command解析：
     *      正常
     *      为空
     *      值为负数
     * 实现Args
     *
     */

    @Test
    public void test(){
        Args2 args2 = new Args2("l:bool,p:int,d:str,g:listStr,D:listInt", "-l -p 8080 -d /usr/logs -D 1,2,-3,5 -g this,is,a,list");
        assertEquals(true, args2.parse("l"));
        assertEquals(new Integer(8080), args2.parse("p"));
        assertEquals("/usr/logs", args2.parse("d"));

        List<String> listStr = (List<String>) args2.parse("g");
        assertEquals("this", listStr.get(0));
        assertEquals("is", listStr.get(1));
        assertEquals("a", listStr.get(2));
        assertEquals("list", listStr.get(3));

        List<Integer> listInt = (List<Integer>) args2.parse("D");
        assertEquals(new Integer(1), listInt.get(0));
        assertEquals(new Integer(2), listInt.get(1));
        assertEquals(new Integer(-3), listInt.get(2));
        assertEquals(new Integer(5), listInt.get(3));
    }



}