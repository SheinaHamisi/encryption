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
}
