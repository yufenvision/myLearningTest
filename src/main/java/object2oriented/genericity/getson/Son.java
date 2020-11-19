package object2oriented.genericity.getson;

import lombok.Data;

/**
 * @Author: dyf
 * @Date: 2020/9/17 22:06
 * @Description:
 */
@Data
public class Son implements Father<SonEntity> {
    private String name;
    private String age;


    @Override
    public void copyValue(SonEntity sonEntity) {
        name = sonEntity.getSonName();
        age = String.valueOf(sonEntity.getSonAge());
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SonEntity sonEntity = new SonEntity();
        sonEntity.setSonName("干儿子");
        sonEntity.setSonAge(18L);

        Son son = new Son();
        son.copyValue(sonEntity);

        son.name = "亲儿子";

        String json = son.toJsonStr();
//        System.out.println(json);

        String xx = "{\"name\":\"亲亲儿子json\"}";

//        System.out.println(son.backFromJson(xx, Son.class));
//        System.out.println(son.backFromJson(json, Son.class).getClass());
        Son son1 = son.backFromJson(xx);
        System.out.println(son1);
        Son son2 = son.backFromJson(json);
        System.out.println(son2);
    }

}
