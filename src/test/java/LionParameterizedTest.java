import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private boolean expectedMane;
    private  String sex;
    private static Feline feline;

    public LionParameterizedTest(String sex, Feline feline, boolean expectedMane) {
        this.sex = sex;
        this.feline = feline;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][] {
                {"Самец", feline, true},
                {"Самка", feline, false}
        };
    }

    @Test
    public void doesHaveManeReturnsTrueIfLionHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedMane, lion.doesHaveMane());
    }
}
