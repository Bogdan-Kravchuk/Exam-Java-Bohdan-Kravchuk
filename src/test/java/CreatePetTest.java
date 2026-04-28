import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CreatePetTest {
    @Test
    void createCat(){ShelterZone.createCat("MyCat", 10);}

    @Test
    void createDog(){ShelterZone.createCat("MyDog", 10);}

    @Test
    void negativeCreateCat() {

        // assertThrows(new IllegalArgumentException(), ShelterZone.createCat("MyCat", 1200));
    }

    
}
