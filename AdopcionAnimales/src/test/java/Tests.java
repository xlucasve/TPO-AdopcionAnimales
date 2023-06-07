import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void tiraError(){
        assertEquals(1, 2);
    }

    @Test
    public void tiraCorrecto(){
        assertEquals(1, 1);
    }
}
