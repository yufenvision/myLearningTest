package java_base.functional_code.lambda.stream;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/12/9 10:15
 */
@Data
public class TwoId2TwoObject {


    public static void main(String[] args) {
        List<TwoId> twoIds = Stream.of(new TwoId(11, "1"), new TwoId(12,"2")).collect(Collectors.toList());
        List<Order> orders = Stream.of(new Order(11,"订单详情1"),new Order(12,"订单详情2")).collect(Collectors.toList());
        List<UserInfo> userInfos = Stream.of(new UserInfo("1","用户详情1"),new UserInfo("2","用户详情2")).collect(Collectors.toList());
        List<TwoInfo> twoInfos = new ArrayList<>();
        for (int i = 0; i < userInfos.size(); i++) {
            twoInfos.add(new TwoInfo(orders.get(i), userInfos.get(i)));
        }
        Map<Integer, String> mapIds = twoIds.stream().collect(Collectors.toMap(v -> v.getOrderId(), v -> v.getUserId()));
        System.out.println(JSON.toJSON(twoInfos));
    }


}

@Data
@AllArgsConstructor
class TwoId{
    Integer orderId;
    String userId;
}

@Data
@AllArgsConstructor
class TwoInfo{
    Order order;
    UserInfo userInfo;
}

@Data
@AllArgsConstructor
class Order {
    Integer orderId;
    String orderName;
}

@Data
@AllArgsConstructor
class UserInfo {
    String userId;
    String UserName;
}
