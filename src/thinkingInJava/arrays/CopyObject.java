package thinkingInJava.arrays;

/**
 * @Author: dyf
 * @Date: 2019/9/5 14:32
 * @Description:
 */
public class CopyObject {
    private Integer phoneNumber = 10086;

    public CopyObject(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CopyObject{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
