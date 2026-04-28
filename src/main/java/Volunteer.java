import java.util.Objects;

public class Volunteer {
    private String name;
    private int age;

    public Volunteer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volunteer volunteer = (Volunteer) o;
        return age == volunteer.age && Objects.equals(name, volunteer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void createVolonteer(String name, int age){
        Volunteer v1 = new Volunteer(name, age);

    }
}
