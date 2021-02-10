import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTest {

    Junit j = new Junit();

    @Test
    public void multiply()throws Exception {
        assertEquals(6, j.multi(2, 3));
    }

    @Test
    public void multiply2()throws Exception {
        assertEquals(10,j.multi(5,7,9));
    }


}