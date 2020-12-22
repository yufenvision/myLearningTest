package bit2caculation.addition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/10/23 15:41
 */
public class Bit2AddMachine {

    private char[] a;
    private char[] b;
    private String result;
    private Integer bit;

    public Bit2AddMachine(Integer bit) {
        this.bit = bit;
    }

    public String getResult() {
        return result;
    }


    /*
     * @param a1 二进制数字
     * @param b1 二进制数字
     * @return: java.lang.String
     * @Author: dyf 
     * @Date: 2020/10/25 上午 10:51
    */
    public String add(String a1, String b1){
        if(a1.length() != b1.length() || a1.length() != bit)return "输入数字长度错误, 请检查";
        a1 = new StringBuffer(a1).reverse().toString();
        b1 = new StringBuffer(b1).reverse().toString();
        this.a = a1.toCharArray();
        this.b = b1.toCharArray();
        return count();
    }

    //十进制数字计算
    public String add(Integer a1, Integer b1){

        return null;
    }


    private String count(){
        List<Boolean> listResult = new ArrayList();
        for (int i = 0; i < bit; i++) {
            if(bit == 1){
                AllAdd allAdd0 = getCIAllAdd(0);
                listResult.add(allAdd0.isSum());
                listResult.add(allAdd0.isCarryOut());
                break;
            }
            AllAdd allAddCI = getCIAllAdd(i);
            listResult.add(allAddCI.isSum());
            if(i == bit -1)listResult.add(allAddCI.isCarryOut());
        }
        result = "";
        Collections.reverse(listResult);
        for (Boolean aBoolean : listResult) {
            result += aBoolean ? '1' : '0';
        }

        return result;
    }

    //递归实现？
    private AllAdd getCIAllAdd(Integer i){
        if(i == 0){
            return new AllAdd(bit(a[0]),bit(b[0]), false);
        }else if(i == 1){
            return new AllAdd(bit(a[1]),bit(b[1]), new AllAdd(bit(a[0]),bit(b[0]), false).isCarryOut());
        }else {
            return new AllAdd(bit(a[i]),bit(b[i]), getCIAllAdd(i-1).isCarryOut());
        }
    }

    public static void main(String[] args) {
        String xx = "123";
        xx = new StringBuffer(xx).reverse().toString();
        System.out.println(xx);
    }

    public boolean bit(char c){
        return c == '0'? false : true;
    }

    public char bit(boolean b){
        return b? '1' : '0';
    }

}
