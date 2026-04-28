import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShelterZone {
    private static final List<Pet> listPets = new ArrayList<>();

    public static void createDog (String name, int age){

        if (age<0 || age>50)
            throw new IllegalArgumentException();

        name = name.trim();

        if (name.isEmpty())
            throw new IllegalArgumentException();

    Pet dog = new Dog(name, age);

    listPets.add(dog);
    }

    public static void createCat (String name, int age){

        if (age<0 || age>50)
            throw new IllegalArgumentException();

        name = name.trim();

        if (name.isEmpty())
            throw new IllegalArgumentException();

        Pet cat = new Cat(name, age);
        listPets.add(cat);
    }


    public static List<Pet> getListPets() {
        return Collections.unmodifiableList(listPets);
    }
}
