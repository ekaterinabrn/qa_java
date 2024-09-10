package practicum;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalExceptionTest {
    @Test
    public void AnimalExpectedException() {
        Animal animal = new Animal();
        Exception exception = assertThrows(Exception.class, () -> animal.getFood("Всеядное"));
        String expectedMessage ="Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals(expectedMessage, exception.getMessage());
    }
}
