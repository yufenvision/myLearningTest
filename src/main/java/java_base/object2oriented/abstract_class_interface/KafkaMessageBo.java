package java_base.object2oriented.abstract_class_interface;

import lombok.Data;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/30 11:20
 */
@Data
public class KafkaMessageBo {
    private String topic;
    private Object data;
    private Integer consumerCount;
}
