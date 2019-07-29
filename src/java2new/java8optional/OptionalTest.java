package java2new.java8optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author: dyf
 * @Date: 2019/5/19 15:27
 * @Description:
 * orElse:如果值为空则返回指定的值
 * orElseGet:如果值为空则调用指定的方法返回
 * orElseThrow:如果值为空则直接抛出异常
 *
 *
 *
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

        List<User> users = Arrays.asList(u);
        users.add(new User("哈哈",12));
        users.add(new User("xx",11));
        System.out.println(users);
    }

}
