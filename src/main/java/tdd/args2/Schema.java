package tdd.args2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: dyf
 * @Date: 2019/8/18 09:19
 * @Description: 获取正确的返回类型
 */
public class Schema {
    private Map<String, String> schemas;

    public Schema(String schemasConfig) {
        schemasConfig.replaceAll("\\s+","");
        schemas = new HashMap<>();
        Arrays.asList(schemasConfig.split(","))
                .stream().forEach(v ->{
                    String[] schemasUnit = v.split(":");
                    schemas.put(schemasUnit[0], schemasUnit[1]);
        });
    }

    /**
     * 根据输入的字符串，得到对应数据类型的数据
     * @return: java.lang.Object
     * @param: [type, strValue]
     * @Author: dyf
     * @Date: 2019/8/18 11:01
    */
    public Object getValue(String type, String strValue) {
        String commandType = schemas.get(type);
        switch (commandType){
            case "bool":
                return "true".equals(Optional.ofNullable(strValue).orElse("false")) ? true : false;
            case "int" :
                return Integer.parseInt(strValue);
            case "str" :
                return strValue;
            case "listStr" :
                return Arrays.asList(strValue.split(","));
            case "listInt" :
                return Arrays.stream(strValue.split(",")).map(v -> Integer.parseInt(v)).collect(Collectors.toList());
        }
        return null;
    }

    public static void main(String[] args){
        String xx = Optional.ofNullable("xx").orElse("false");
        System.out.println(xx);
    }

}
