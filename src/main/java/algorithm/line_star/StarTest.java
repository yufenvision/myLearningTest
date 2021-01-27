package algorithm.line_star;

import java.util.LinkedList;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/1/27 17:01
 */
public class StarTest {
    public static void main(String[] args) {
        /*String blank = " ";
        String star = "*";
        LinkedList<String> blankList = new LinkedList<>();
        LinkedList<String> starList = new LinkedList<>();

        int num = 5;
        for (int i = 0; i < num; i++) {
            blankList.addLast("");
            blankList.addFirst("*");
        }*/
        int level = 5;
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < level - i; j++) {
                System.out.print(" ");
            }
            int n = i * 2 + 1;
            for (int j = 0; j < n; j++) {
//                if(j % 2 == 0)
//                    System.out.print(" ");
//                else
                    System.out.print("*");
            }
            System.out.println();

        }
    }


//    public static String addStar(int i){
//        int n = i*2 - 1;
//
//    }

}
