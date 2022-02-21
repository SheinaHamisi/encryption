import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    @Test
    public void checkInput_checksIfInputIsString() {
        Encrypt value = new Encrypt("z", 25);
        assertEquals(true, value.isString());
    }

    @Test
    public void checkInput_checksIfKeyIsBetween1to25() {
        Encrypt value = new Encrypt("z", 25);
        assertEquals(true, value.isInRange());
    }
}