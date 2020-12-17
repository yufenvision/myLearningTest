package java_base.object2oriented.genericity.getson;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: dyf
 * @Date: 2020/9/17 22:07
 * @Description:
 */
@Data
public class SonEntity{
    private String sonName;

    private Long sonAge;

    public SonEntity() {
    }

    public SonEntity(String sonName, Long sonAge) {
        this.sonName = sonName;
        this.sonAge = sonAge;
    }

    public static void main(String[] args){
        SonEntity s1 = new SonEntity("1",2L);
        SonEntity s2 = new SonEntity("1",1L);
        SonEntity s3 = new SonEntity("1",2L);

        Set<SonEntity> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SonEntity sonEntity = (SonEntity) o;

        return sonName != null ? sonName.equals(sonEntity.sonName) : sonEntity.sonName == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (sonName != null ? sonName.hashCode() : 0);
        return result;
    }
}
