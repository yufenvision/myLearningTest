package java2new.java8optional;

import java.util.Optional;

/**
 * @Author: dyf
 * @Date: 2019/5/19 15:27
 * @Description:
 */
public class OptionalTest {

    public static void main(String[] args){
        Optional<String> name = Optional.of("yuf");
        System.out.println(name);
        //Optional<String> someNull1 = Optional.of(null);//会空指针
        Optional<String> someNull2 = Optional.ofNullable(null);
        System.out.println(someNull2);
        System.out.println(someNull2.orElse(null));
        System.out.println(someNull2.orElse("这是空的"));
        //map函数
        User u = new User();
        System.out.println(Optional.ofNullable(u)
                .map(v -> v.getName())
                .orElse("这个User对象为空"));
    }

}
