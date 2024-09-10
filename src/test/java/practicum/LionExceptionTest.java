package practicum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void lionExceptionSexTest() {
        try {
           Lion lion = new Lion("noname", feline );
            assertTrue(lion.doesHaveMane());
        } catch (Exception e) {

            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }

    }
}
