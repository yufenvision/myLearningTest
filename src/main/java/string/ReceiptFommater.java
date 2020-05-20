package string;/**
 * @Author: dyf
 * @Date: 2019/4/29 09:10
 * @Description:
 */

import java.util.Formatter;

/**
 * @Author: dyf
 * @Date: 2019/4/29 09:10
 * @Description:
 */
public class ReceiptFommater {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    //在插入数据时，如果想要控制空格与对齐，可以用入如下抽象的语法：%[argument_index$][flag][width].[precision]conversion
    //                                                                   【对齐方式】【宽度】.【最大尺寸】
    public void printTitle(){
        //默认情况下是右对齐，但可以通过"-"来改变对齐方向
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price){
        f.format("%-15.15s %5d %10.2f\n", name ,qty, price);
        total += price;
    }

    //precision应用于string时，表示打印String时输出字符的最大数量
    //precision应用于浮点数时，表示小数部分要显示出来的位数（默认是6位），运算为四舍五入和补0
    //precision无法应用于整数
    public void printTotal(){
        f.format("%-15.15s %5s %10.2f\n", "Tax" ,"", total * 0.06);
        f.format("%-15.15s %5s %10s\n", "" ,"", "-----");
        f.format("%-15.15s %5s %10.2f\n", "Total" , "", total * 1.06);
    }

    public void printConstantWidth(){
        final String row1Width = "-15.15";//把宽度变为常量
        f.format("\n\n");
        f.format("%"+row1Width+"s" + " %5s %10s\n", "name", "sex", "code");//存在中文对齐问题，\t也不行？
        f.format("%"+row1Width+"s" + " %5s %10s\n", "***************", "*****", "**********");
        f.format("%"+row1Width+"s" + " %5s %10s\n", "凌凌漆","男","95279527");
    }

    //String.format()和Formatter.format()一样，但返回一个String对象
    public void print99Table(){//对齐的99乘法表
        for(int i = 1;i<=9;i++){
            for(int j=1;j<=i;j++){
//                f.format("%1d*%1d = %-3d", i, j, i * j);
                System.out.print(String.format("%1d*%1d = %-3d", i, j, i * j));
            }
//            f.format("\n");
            System.out.print(String.format("\n"));
        }
    }

    public static void main(String[] args){
        ReceiptFommater receipt = new ReceiptFommater();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4 ,4.25);
        receipt.print("Princess Peas", 3 ,5.1);
        receipt.print("Three Bears Porridge", 1 ,14.29);
        receipt.printTotal();
        receipt.printConstantWidth();
        receipt.print99Table();
        Formatter f = new Formatter();
        System.out.println(f.format("%s", "哈哈哈"));
    }
}
