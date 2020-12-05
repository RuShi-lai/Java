package WesterFriendChickenRestaurant;

public class OverdraftBalanceException extends Exception{
    public OverdraftBalanceException(String message) {
        super(message);
    }
}
