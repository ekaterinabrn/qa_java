package practicum;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void catGetSoundIsMeow() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        assertEquals("Должно быть мяу", expectedSound, cat.getSound());
    }

    @Test
    public void catGetPredatorListOfFood() throws Exception {
        Cat cat = new Cat(feline);
        // List<String> expectedredatorFood = List.of("Животные", "Птицы", "Рыба");
        // assertEquals("Должны совпадать списки еды", expectedredatorFood, cat.getFood());
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedListOfFood);
        assertEquals("Вернулся некорректный список еды", expectedListOfFood, cat.getFood());
    }


}



