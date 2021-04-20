package java_base.enum_test;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum PersonTypeEnum {
    CoreRegular("kl_person_regular", null, "core-person-regular", "公共部分常客信息表"),

    CoreVisitor("kl_person_visitor", null, "core-person-visitor", "公共部分访客信息表"),

    SwustStuTea("kl_person_stu_tea", null, "swust-person-stu-tea", "西科大项目师生表"),

    SwustRebirth("kl_person_swust_rebirth", "Rebirth", "swust-person-rebirth", "西科大项目参会人员表"),

    SwustParticipant("kl_person_swust_participant", "Participant", "swust-person-participant", "西科大项目新生表"),

    SaepDineUser("kl_person_dine_user", null, "saep-dine-user", "宜宾科教园食堂系统注册人员");

    /**
     * 数据表名称
     */
    private final String tn;


    /**
     * 人员所属分区
     */
    private final String part;

    /**
     * 业务标识
     */
    private final String label;

    /**
     * 类型描述
     */
    private final String desc;

    private final static Map<String, PersonTypeEnum> map = Stream.of(values()).collect(Collectors.toMap(PersonTypeEnum::label, it -> it));
    private final static Map<String, PersonTypeEnum> mapPro = Stream.of(values()).collect(Collectors.toMap(PersonTypeEnum::tn, it -> it));

    PersonTypeEnum(String tn, String part, String label, String desc) {
        this.tn = tn;
        this.part = part;
        this.label = label;
        this.desc = desc;
    }

    public String tn() {
        return tn;
    }

    public String part() {
        return part;
    }

    public String desc() {
        return desc;
    }

    public String label() {
        return label;
    }

    public static PersonTypeEnum labelOf(String label) {
        return map.get(label);
    }

    public static PersonTypeEnum tnOf(String label) {
        return mapPro.get(label);
    }
}
