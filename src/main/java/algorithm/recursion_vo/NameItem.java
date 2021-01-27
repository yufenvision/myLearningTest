package algorithm.recursion_vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/1/27 14:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NameItem {
    private String id;
    private String pid;
    private String name;
    private List<NameItem> children;

}
