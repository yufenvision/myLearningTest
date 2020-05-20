package thinkingInJava.interfacetest.decoupled;

/**
 * @Author: dyf
 * @Date: 2019/7/4 10:51
 * @Description:
 */
class Downcase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}
