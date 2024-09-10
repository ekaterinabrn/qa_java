package practicum;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


    @RunWith(Parameterized.class)
    public class LionParamTest {
        private Lion lion;
        private Feline feline;
        private String sex;
        private boolean hasMane;

        @Before
        public void setUp() {
            feline = Mockito.mock(Feline.class);
        }

        public LionParamTest(String sex, boolean hasMane) {
            this.sex = sex;
            this.hasMane = hasMane;
        }

        @Parameterized.Parameters
        public static Object[][] setSexForLion() {
            return new Object[][] {
                    {"Самец", true},
                    {"Самка", false}
            };
        }

        @Test //тест наличия отсутсвия гривы
        public void testDoesHaveMane() throws Exception {
            lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(hasMane, actual);
        }
    }



