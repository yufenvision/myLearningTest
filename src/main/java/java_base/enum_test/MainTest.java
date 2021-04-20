package java_base.enum_test;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/4/19 17:18
 */
public class MainTest {

    public static void main(String[] args) {


        System.out.println(NameEnum.tableName.ordinal());
        System.out.println(NameEnum.tableName.name());
//        System.out.println(NameEnum.tableName.name().equals(NameEnum.tableName));

        System.out.println(PersonTypeEnum.labelOf("saep-dine-user"));
    }

}
