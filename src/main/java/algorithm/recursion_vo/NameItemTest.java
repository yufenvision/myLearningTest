package algorithm.recursion_vo;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/1/27 14:16
 */
public class NameItemTest {
    private static List<NameItem> dbList = new ArrayList<>();
    private static Map<String, NameItem> db = new HashMap<>();
    static {
        dbList.add(new NameItem("1","0","name1", new ArrayList<NameItem>()));
        dbList.add(new NameItem("2","1","name2", new ArrayList<NameItem>()));
        dbList.add(new NameItem("3","2","name3", new ArrayList<NameItem>()));
        dbList.add(new NameItem("4","0","name4", new ArrayList<NameItem>()));
        dbList.add(new NameItem("5","4","name5", new ArrayList<NameItem>()));
        dbList.add(new NameItem("6","5","name6", new ArrayList<NameItem>()));
        dbList.add(new NameItem("7","5","name7", new ArrayList<NameItem>()));

        dbList.forEach(v -> db.put(v.getId(),v));
    }


    public static void main(String[] args) {
//        System.out.println(JSONObject.toJSONString(findId("0")));
        System.out.println(JSONObject.toJSONString(findByPid("0")));
//        NameItem nameItem = linkedList.pop();

//        System.out.println(JSONObject.toJSONString(linkedList));
    }

    private static List<NameItem> getListByPid(String pid){
        List<NameItem> list = new ArrayList<>();
        dbList.forEach(v -> {
            if (v.getPid().equals(pid))list.add(v);
        });
        return list;
    }

    private static NameItem findByPid(String id){
        NameItem item = db.get(id);
        if(item == null){
            return item;
        }else if(item.getChildren().size() == 0){
            return item;
        }else {
            item.getChildren().add(findByPid(id));
            return item;
        }
    }


    private static List<NameItem> findId(String pid) {
        List<NameItem> a = new ArrayList<>();
        for (NameItem nameItem : dbList) {
            if (pid.equals(nameItem.getPid())) {
                a.add(nameItem);
            }
        }
        for (NameItem nameItem : a) {
            nameItem.setChildren(findId(nameItem.getId()));
        }
        return a;
    }

}
