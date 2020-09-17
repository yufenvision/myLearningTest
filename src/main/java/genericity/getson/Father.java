package genericity.getson;

import com.google.gson.Gson;

/**
 * @Author: dyf
 * @Date: 2020/9/17 22:04
 * @Description:
 */
public interface Father<T> {
    Gson gson = new Gson();

    void copyValue(T t);

    default <A extends Father> A backFromJson(String str, Class<A> cls){
        return gson.fromJson(str, cls);
    }

    default String toJsonStr(){
        return gson.toJson(this);
    }
}
