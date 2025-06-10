import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final String animalKind;
    private final List expectedFood;

    public FelineParameterizedTest(String animalKind, List expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] getFood() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodReturnsFoodForEachAnimalKind() throws Exception {
        Feline feline = new Feline();
        assertEquals(expectedFood, feline.getFood(animalKind));
    }
}