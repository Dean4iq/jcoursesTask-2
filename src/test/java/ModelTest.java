import model.Model;
import org.junit.jupiter.api.RepeatedTest;

import static junit.framework.TestCase.*;

class ModelTest {

    @RepeatedTest(1000)
    void testRandomMaxNumber() {
        Model model = new Model();
        assertEquals((model.getMaxNumber() - 1), model.getChosenNumb());
    }

    @RepeatedTest(1000)
    void testRandomMinNumber() {
        Model model = new Model();
        assertEquals((model.getMinNumber() + 1), model.getChosenNumb());
    }

    @RepeatedTest(1000)
    void testBoundsMoreThanMax() {
        Model model = new Model();
        assertTrue(model.getChosenNumb() >= model.getMaxNumber());
    }

    @RepeatedTest(1000)
    void testBoundsLessThanMin() {
        Model model = new Model();
        assertTrue(model.getChosenNumb() <= model.getMinNumber());
    }
}
