package algorithm.recursion_vo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class student {
//    String a = "1111111111111111111111111111111111111111111111111111111111";
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        student student = (student) o;
//        return a.equals(student.a);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(a);
//    }
    static List<NameItem> rs = new ArrayList<>();

    static {

    rs.add(new NameItem("1", "0", "name1", new ArrayList<NameItem>()));
    rs.add(new NameItem("2", "1", "name2", new ArrayList<NameItem>()));
    rs.add(new NameItem("3", "2", "name3", new ArrayList<NameItem>()));
    rs.add(new NameItem("4", "0", "name4", new ArrayList<NameItem>()));
    rs.add(new NameItem("5", "4", "name5", new ArrayList<NameItem>()));
    rs.add(new NameItem("6", "5", "name6", new ArrayList<NameItem>()));
    rs.add(new NameItem("7", "5", "name7", new ArrayList<NameItem>()));
    }
    @Test
    public void test(){
        NameItem children = new NameItem();
        children = digui(children,rs,0);
        System.out.print(children);
    }

    public NameItem digui(NameItem children,List<NameItem> rs,int i){
        if(i>=rs.size()){
            return children;
        }
        NameItem children1 = new NameItem();
        children1=rs.get(i);
        children1.getChildren().add(children);
        i++;
        children = digui(children1,rs,i);
        return children;
    }
}
