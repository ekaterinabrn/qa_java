package practicum;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal animal;

    @Before
    public void initAnimal() {
        animal = new Animal();
    }

    @Test
    public void animalGetFamilyTest() {
        String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals( expectedFamily, animal.getFamily());
    }
}
