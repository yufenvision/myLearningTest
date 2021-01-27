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
    private static Map<String, NameItem> getByIdFromDB = new HashMap<>();
    static {
        dbList.add(new NameItem("1","0","name1", new ArrayList<NameItem>()));//1
        dbList.add(new NameItem("2","1","name2", new ArrayList<NameItem>()));//2
        dbList.add(new NameItem("3","2","name3", new ArrayList<NameItem>()));//3
        dbList.add(new NameItem("4","0","name4", new ArrayList<NameItem>()));//1
        dbList.add(new NameItem("5","4","name5", new ArrayList<NameItem>()));//2
        dbList.add(new NameItem("6","5","name6", new ArrayList<NameItem>()));//3
        dbList.add(new NameItem("7","5","name7", new ArrayList<NameItem>()));//3

        dbList.forEach(v -> getByIdFromDB.put(v.getId(),v));//等同于用id从库里查数据。
    }

    private static List<NameItem> getByPidFromDB(String pid){//等同于用pid从库里查数据
        List<NameItem> list = new ArrayList<>();
        dbList.forEach(v -> {
            if(v.getPid().equals(pid))list.add(v);
        });
        return list;
    }

    public static void main(String[] args) {
//        System.out.println(JSONObject.toJSONString(findId("1")));
//        System.out.println(JSONObject.toJSONString(findByPid("1")));
        List<NameItem> list = new ArrayList<>();
        dbList.forEach(v -> {
            if(v.getPid().equals("0")){
                list.add(findByPid(v.getId()));
            }
        });
        System.out.println(JSONObject.toJSONString(list));
    }


    private static NameItem findById(NameItem item){
        if(item == null){
            return item;
        }
        List<NameItem> nameItems = getByPidFromDB(item.getId());
        item.setChildren(nameItems);
        nameItems.forEach(v -> {
            if(v.getPid().equals(item.getId()))v.getChildren().add(findByPid(v.getId()));
        });
        return item;
    }


    private static NameItem findByPid(String id){
        NameItem item = getByIdFromDB.get(id);
        if(item == null){
            return item;
        }
        List<NameItem> nameItems = getByPidFromDB(id);
        item.setChildren(nameItems);
        nameItems.forEach(v -> {
            if(v.getPid().equals(id))v.getChildren().add(findByPid(v.getId()));
        });
        return item;
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
