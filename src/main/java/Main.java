import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        prompts User for input
        System.out.println("Input String:");
        String text = scanner.nextLine();

        //        prompts User for input
        System.out.println("Encryption Key:");
        Integer key = scanner.nextInt();

        //        creates new encryption object
        Encrypt newEncryption = new Encrypt(text, key);

        //        Checks for number digits in text to be encrypted
        if(!newEncryption.isString()){
            System.out.println("Invalid Entry");
        }

        //        checks to see if key is in range of 1 to 25
        if (!newEncryption.isInRange()){
            System.out.println("Key Range is between 1 and 25");
        }
//        Prints Encrypted text
        String encryptedText = newEncryption.forward();
        System.out.println(String.format("Encrypted String: %s", encryptedText));

        //        creates new decryption object
        Decrypt newDecryption = new Decrypt(encryptedText, key);

        //        Prints Decrypted text
        String deryptedText = newDecryption.backward();
        System.out.println(String.format("Decrypted String: %s", deryptedText));
    }

}
