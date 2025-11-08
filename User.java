public class User {
    private String userId;
    private String pin;

    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public boolean validateLogin(String inputUserId, String inputPin) {
        return this.userId.equals(inputUserId) && this.pin.equals(inputPin);
    }
}
