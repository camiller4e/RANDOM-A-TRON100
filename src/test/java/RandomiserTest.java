import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RandomiserTest {

    Randomiser randomiser;

    @Before
    public void setUp() throws Exception {
        randomiser = new Randomiser();
    }

    @Test
    public void hasPeople(){
        assertEquals(3, randomiser.getChoices().size());
    }
}
