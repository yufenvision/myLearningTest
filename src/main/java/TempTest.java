import com.google.gson.Gson;
import lombok.Data;
import myTest.md5.MD5Utils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Consumer;

/**
 * @Author: dyf
 * @Date: 2020/9/1 11:26
 * @Description:
 */
public class TempTest {



    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        B b = new B();
        Gson gson = new Gson();
        b.age = "13";
        System.out.println(gson.toJson(b));

        D d = new D();
        d.xx = "xx";
        System.out.println(gson.toJson(d));
    }

}

abstract class A{
    protected String name = "抽象类";
    protected void show(){
        System.out.println(this.name);
    }
}

@Data
class B extends A{
    public String age;

}

interface C{
    String iName = "接口";
}

@Data
class D implements C{
    public String xx;
}