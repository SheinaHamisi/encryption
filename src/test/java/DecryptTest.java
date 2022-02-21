import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {
    @Test
    public void decryptsSmallCaseSingleCharacters() {
        Decrypt newDecryption = new Decrypt("z", 1);
        assertEquals("y", newDecryption.backward());
    }
}