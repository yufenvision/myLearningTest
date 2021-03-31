package java_base.functional_code.lambda.stream;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/3/31 11:12
 */
public class Collectors2Map {

    public static void main(String[] args) {
        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version", 6.19));
        pairArrayList.add(new Pair<>("version", 10.24));
        pairArrayList.add(new Pair<>("version", 13.14));
        pairArrayList.add(new Pair<>("version", null));//当value为null时，利用collectors转换为map会抛出NPE异常

        // 没有使用参数类型为BinaryOperator，参数名为 mergeFunction 的方法，来给出key重复策略，会抛出IllegalStateException异常
        /*Map<String, Double> map = pairArrayList.stream().collect(
                Collectors.toMap(Pair::getKey, Pair::getValue)
        );*/

        Map<String, Double> map = pairArrayList.stream().collect(
                Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v2)
        );

        System.out.println(map);

    }

}
