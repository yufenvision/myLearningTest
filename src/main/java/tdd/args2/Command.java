package tdd.args2;

import java.util.*;

/**
 * @Author: dyf
 * @Date: 2019/8/18 11:04
 * @Description:
 */
public class Command {
    Map<String, String> command;

    public Command(String commandStr) {
        command = new HashMap<>();
        ListIterator<String> iterator = Arrays.asList(commandStr.split("\\s+")).listIterator();
        while (iterator.hasNext()) {
            String key = iterator.next().substring(1);
            if(iterator.hasNext()){
                String value = iterator.next();
                if (!isNegative(value) && value.indexOf("-") > -1) {
                    value = "true";
                    iterator.previous();
                }
                command.put(key, value);
            }
        }
    }

    private boolean isNegative(String value) {
        if(value.matches(".*-[1-9].*"))return true;
        return false;
    }

    public String getValue(String key) {
        return command.get(key);
    }

    public static void main(String[] args){
//        ListIterator<String> iterator = Arrays.asList("-l -p 8080 -d /usr/logs -g this,is,a,list -D 1,2,-3,5".split("\\s+")).listIterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println("-p".indexOf("-") > -1);
        System.out.println("1,2,-3,5".matches(".*-[1-9].*"));
    }
}
