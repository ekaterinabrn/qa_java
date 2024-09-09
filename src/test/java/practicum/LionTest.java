package practicum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void lionHasVoidGetKittens() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        lion.getKittens(); //вызвали метод у льва
        Mockito.verify(feline).getKittens();//проверили у кошачьих
    }
    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        // Ожидаемый список еды для хищника
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFoodList);
        assertEquals("Вернулся некорректный список еды", expectedFoodList, lion.getFood());
    }

}


