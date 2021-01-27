package algorithm.recursion_vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/1/27 16:44
 */
@Data
@AllArgsConstructor
public class NameItemLinked {
    private String id;
    private String pid;
    private String name;
    private NameItemLinked children;
}
