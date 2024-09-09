package practicum;
import com.example.Animal;
import com.example.Feline;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;
/*

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    Feline feline;
    private String animalKind;
    private List<String> expectedFood;
    private int kittensCount;

    public FelineParameterizedTest(String animalKind, List<String> expectedFood, int kittensCount) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
        this.kittensCount = kittensCount;
    }

    @Before
    public void initFeline() {
        MockitoAnnotations.initMocks(this);
    }

}
@Parameterized.Parameters
public static Object[][] testData() {
    return new Object[][]{
            {"Травоядное", List.of("Трава", "Различные растения"), 3},
            {"Хищник", List.of("Животные", "Птицы", "Рыба"), 5},

    };
    @Test
    public void testEatMeat() throws Exception {
        // Настраиваем мока, чтобы метод eatMeat возвращал ожидаемую еду для типа animalKind
        assertEquals(expectedFood, feline.eatMeat());
    }
*/
