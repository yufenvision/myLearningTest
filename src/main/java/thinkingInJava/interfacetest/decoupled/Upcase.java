package thinkingInJava.interfacetest.decoupled;

/**
 * @Author: dyf
 * @Date: 2019/7/4 10:43
 * @Description:
 */
class Upcase extends Processor {
    String process(Object input){//重写
        return ((String)input).toUpperCase();
    }
}
