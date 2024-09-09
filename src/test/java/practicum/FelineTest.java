package practicum;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class FelineTest {
    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }


    @Test //Проверка, что в методе getKittens() без параметров вернеться 1 котенок
    public void getKittensReturnOneKittenDefault() {
        int expectedCount = 1;
        assertEquals("Количество котят должно быть 1", expectedCount, feline.getKittens());
    }

    @Test //метод getKittens()  с конкретным значением
    public void getKittensWithCount() {
        int kittensCount = 3;
        assertEquals("Количество котят отличается от ожидаемого ", kittensCount, feline.getKittens(kittensCount));
    }

    @Test //Проверка семейства
    public void getFamilyShouldBeFeline() {
        String expectedFamily = "Кошачьи";
        assertEquals("Должно быть семейство кошачьих", expectedFamily, feline.getFamily());

    }

    @Test //тест метода eatMeat(), что он выводит нужный список еды для Feline
    public void felineEatMeatIsMeat() throws Exception {
        List<String> foodFofFeline = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Должен быть список для хищника", foodFofFeline, feline.eatMeat());
    }

}
