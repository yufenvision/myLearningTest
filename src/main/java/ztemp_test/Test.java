package ztemp_test;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: dyf
 * @Date: 2020/9/1 16:06
 * @Description:
 */
@Slf4j
public class Test {

    public static void main(String[] args){
//        Son son = new Son();
//        System.out.println(son.name);
//
//        Other other = new Other();
//        System.out.println(other.father.p);


        String address = "四川省成都市温江区同兴东路 88 号 2 栋 1 单元 1 层 02 号".replace(" ","");
        Pattern pattern = Pattern.compile("(\\d+栋.*)");
        Matcher m = pattern.matcher(address);
        String parseStr = "";
        if(m.find())parseStr = m.group();
        log.error(parseStr);
        String deParese = parseStr.replaceAll("\\D+","-");
        deParese = deParese.substring(0, deParese.lastIndexOf("-"));
        String[] arr = deParese.split("-");
        Map<String, String> map = new HashMap<>();
        map.put("buildNum", arr[0]);
        map.put("unitNum", arr[1]);
        map.put("floorNum", arr[2]);
        map.put("roomNum", arr[3]);
        log.info(map.get("buildNum"));

    }
}
