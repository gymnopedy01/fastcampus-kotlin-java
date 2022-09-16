import lombok.EqualsAndHashCode;
import lombok.ToString;


public class DelombokHero {
    private String name;
    private int age;
    private String address;

    public static void main(String[] args) {
        DelombokHero hero = new DelombokHero();
        hero.setName("아이언맨");
        hero.setAge(53);
        hero.setAddress("스타크타워");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
