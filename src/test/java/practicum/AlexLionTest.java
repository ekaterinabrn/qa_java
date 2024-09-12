package practicum;

import com.example.AlexLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    @Mock
    Feline feline;

    @Test
    public void alexGetKittenTest() throws  Exception{
        AlexLion alexLion= new AlexLion(feline);
        int excpectedKittenAlex =0;
        assertEquals(excpectedKittenAlex, alexLion.getKittens());

    }
    @Test
    public void alexLivingTest() throws Exception{
        AlexLion alexLion= new AlexLion(feline);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alexLion.getFriend());
    }
}
