package genericity.getson;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Author: dyf
 * @Date: 2020/9/17 22:04
 * @Description:
 */
public interface Father<T> {
    Gson gson = new Gson();

    void copyValue(T t);

    default <A extends Father> A backFromJson(String str) throws IllegalAccessException, InstantiationException {
//        System.out.println(getClass());
//        ParameterizedType type1 = (ParameterizedType)getClass().getGenericInterfaces()[0];
//        System.out.println(type1.getTypeName());
//        Type type = type1.getActualTypeArguments()[0];
//        System.out.println(type.getTypeName());
//        Class<A> clz = (Class<A>) type;
//        Class<A> type = (Class<A>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        System.out.println(type.newInstance());
        return gson.fromJson(str, (Type) getClass());
    }

    default String toJsonStr(){
        return gson.toJson(this);
    }
}
