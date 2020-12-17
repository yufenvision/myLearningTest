package java_base.object2oriented.abstract_class_interface;

import java.util.List;

/**
 * @Author: dyf
 * @Date: 2020/11/30 11:19
 * @Description:
 */
public interface ConsumerService {

    void onReceive(List<KafkaMessageBo> kafkaMessageBoList);

    void onConsume(KafkaMessageBo kafkaMessageBo);
}
