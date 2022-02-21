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

    @Test
    public void Encrypt_EncryptsSingleLowerCaseCharacters() {
        Encrypt newEncryption = new Encrypt("z", 1);
        assertEquals("a", newEncryption.forward());
    }

    @Test
    public void Encrypt_EncryptsWordsLowerCaseCharacters() {
        Encrypt newEncryption = new Encrypt("abc", 1);
        assertEquals("bcd", newEncryption.forward());
    }

    @Test
    public void Encrypt_EncryptsUpperCaseWords() {
        Encrypt newEncryption = new Encrypt("ABC", 1);
        assertEquals("BCD", newEncryption.forward());
    }
}