package practicum;
import com.example.Feline;
import com.example.Lion;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestWithParam {
    private String sex;
    private boolean hasMane;
public LionTestWithParam(String sex, boolean hasMane){
    this.sex=sex;
    this.hasMane=hasMane;
}
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;
    @Parameterized.Parameters
    public static Object[][] setSexForLion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void doesHaveManeTest() throws Exception {

        Lion lion = new Lion(feline, sex);

        assertEquals("Грива у самца", hasMane, lion.doesHaveMane());
    }

}
