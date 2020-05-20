package thinkingInJava.arrays;

/**
 * @Author: dyf
 * @Date: 2019/9/5 11:31
 * @Description:
 */
public class ForCopy {

    String name = "复制";
    Integer age = 19;
    private CopyObject copyObject;
    public ForCopy(CopyObject copyObject) {
        this.copyObject = copyObject;
    }

    public ForCopy(String name, Integer age, CopyObject copyObject) {
        this.name = name;
        this.age = age;
        this.copyObject = copyObject;
    }

    @Override
    public String toString() {
        return "ForCopy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", copyObject=" + copyObject +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CopyObject getCopyObject() {
        return copyObject;
    }

    public void setCopyObject(CopyObject copyObject) {
        this.copyObject = copyObject;
    }
}
