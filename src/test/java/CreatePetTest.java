import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvSources;

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


   /* @ParameterizedTest
    @CsvSources (value = {
        //    "name", 5


    })
   // void createManyVolomteeres(){

//Volunteer v = new Volunteer();

    }




    */
}
