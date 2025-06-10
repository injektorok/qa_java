import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Test(expected = java.lang.Exception.class)
    public void getFoodWithoutParameterThrowsException() throws Exception {
        feline.getFood("");
    }

    @Test
    public void eatMeatReturnsListOfFoodForPredators() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnsKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittens1ReturnsKittenCount() {
        assertEquals(1, feline.getKittens(1));
    }
}