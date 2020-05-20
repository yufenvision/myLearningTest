package tdd.args2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author: dyf
 * @Date: 2019/8/18 09:44
 * @Description:
 */
public class SchemaTest {

    @Test
    public void test_bool(){
        Schema schemas = new Schema("l:bool");
        assertEquals(true, schemas.getValue("l", "true"));
        assertEquals(false, schemas.getValue("l", "false"));
        assertEquals(false, schemas.getValue("l",null));
    }

    @Test
    public void test_int(){
        Schema schemas = new Schema("p:int");
        assertEquals(8080, schemas.getValue("p", "8080"));

    }
    @Test
    public void test_Str(){
        Schema schemas = new Schema("d:str");
        assertEquals("/usr/logs", schemas.getValue("d", "/usr/logs"));
    }
    @Test
    public void test_ListStr(){
        Schema schemas = new Schema("g:listStr");
        List<String> listInt = (List<String>) schemas.getValue("g","this,is,a,list");
        assertEquals("this", listInt.get(0));
        assertEquals("is", listInt.get(1));
        assertEquals("a", listInt.get(2));
        assertEquals("list", listInt.get(3));
    }
    @Test
    public void test_ListInt(){
        Schema schemas = new Schema("D:listInt");
        List<Integer> listInt = (List<Integer>) schemas.getValue("D","1,2,-3,5");
        assertEquals(new Integer(1), listInt.get(0));
        assertEquals(new Integer(2), listInt.get(1));
        assertEquals(new Integer(-3), listInt.get(2));
        assertEquals(new Integer(5), listInt.get(3));
    }
}
