package practicum;
import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
                {"Неизвестный вид", List.of("", "")}

        };
    }

    @Before
    public void initAnimal() {
        animal = new Animal();
    }

    @Test
    public void animalFoodTestWithException() {
        try {
            Assert.assertEquals(expectedFood,animal.getFood(animalKind));


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

