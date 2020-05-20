package thinkingInJava.interfacetest.decoupled;

/**
 * @Author: dyf
 * @Date: 2019/7/4 10:42
 * @Description:
 */
class Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}
