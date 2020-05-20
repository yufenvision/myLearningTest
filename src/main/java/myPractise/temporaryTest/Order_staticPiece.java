package myPractise.temporaryTest;

public class Order_staticPiece {		//1.第一步，准备加载类

    public static void main(String[] args) {
        new Order_staticPiece();		//4.第四步，new一个类，但在new之前要处理匿名代码块        
        run();
        new Order_staticPiece().runSimple();
    }

    static String num = "我是静态变量";     //2.第二步，静态变量和静态代码块的加载顺序由编写先后决定 

    {
        num = "new对象前，要先执行匿名代码块";
        System.out.println(num);
        System.out.println("b--处理匿名代码块");        //5.第五步，按照顺序加载匿名代码块，代码块中有打印
    }

    int a = 5;                          //6.第六步，按照顺序加载变量

    { // 成员变量第三个
    	System.out.println("加载成员变量："+a);
        System.out.println("c--按照顺序处理匿名代码块");        //7.第七步，按照顺序打印c
    }

    Order_staticPiece() { // 类的构造函数，第四个加载
        System.out.println("d--执行构造方法");        //8.第八步，最后加载构造函数，完成对象的建立
        System.out.println("------------");
    }

    static {							// 3.第三步，静态块，然后执行静态代码块，因为有输出，故打印num
    	System.out.println(num);
        System.out.println("a--执行静态代码块");
    }

    static void run(){                  // 静态方法，调用的时候才加载// 注意看，e没有加载
        System.out.println("我是静态方法，调用时候才加载：e");
    }
    
    void runSimple(){
    	System.out.println("f");
    }
}
//加载顺序:静态变量>静态代码块>new一个类，但是new之前要处理匿名代码块，同时加载成员变量>加载构造函数------静态方法调用的时候才加载