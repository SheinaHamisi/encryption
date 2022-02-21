public class Encrypt {

    private String message;
    private int key ;

    public Encrypt(String message, int key) {
        this.message = message;
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public boolean isString() {
        for (int i = 0; i < this.message.length(); i++){
            if (this.message.charAt(i) >= '0' && this.message.charAt(i) <= '9'){
                System.out.println("Expected characters or words");
                return false;
            }
        }
        return true;
    }

    public boolean isInRange() {
        return this.key >= 1 && this.key <= 25;
    }

    public String forward() {
        char[] newCharText = message.toCharArray();

        for (int i = 0; i < newCharText.length; i++){
            //        For uppercase letters
            if (Character.isUpperCase(newCharText[i])){
                int castText = ((int) newCharText[i] - 65 + this.key) % 26 + 65;
                newCharText[i] = (char)castText;
            }
            //        For lowercase letters
            else if (Character.isLowerCase(newCharText[i])){
                int castText = ((int) newCharText[i] - 97 + this.key) % 26 + 97;
                newCharText[i] = (char)castText;
            }
        }

        final String newS = String.valueOf(newCharText);
        return newS;
    }
}
