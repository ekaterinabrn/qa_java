package practicum;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalWithParamTest {
    Animal animal;
    private final String animalKind;
    private final List<String> expectedFood;

    public AnimalWithParamTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }


    @Parameterized.Parameters
    public static Object[][] object() {
        return new Object[][]{{"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},

        };
    }

    @Before
    public void initAnimal() {
        animal = new Animal();
    }

    @Test
    public void animalFoodTestWithException() throws Exception {

            List<String> actual = animal.getFood(animalKind);
            Assert.assertEquals(expectedFood, actual);

        }


    }


