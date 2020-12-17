package java_base.object2oriented.abstract_class_interface;


import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/30 15:55
 */
@Slf4j
public class Test {

//    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        KafkaMessageBo kafkaMessageBo = new KafkaMessageBo();
        kafkaMessageBo.setTopic("topic1");
        kafkaMessageBo.setData("data");
        kafkaMessageBo.setConsumerCount(1);
        log.info("主题：{}，数据：{}，计数：{}", kafkaMessageBo.getTopic(), kafkaMessageBo.getData(), kafkaMessageBo.getConsumerCount());
        
    }

}
