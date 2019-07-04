package thinkingInJava.interfacetest.decoupled;

import java.util.Arrays;

/**
 * @Author: dyf
 * @Date: 2019/7/4 10:52
 * @Description:
 */
class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
