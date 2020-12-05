package WesterFriendChickenRestaurant;

public class SetMeal {

    public String mealName;
    public double price;
    public String fryChiCkenName;
    public String drinkName;
    public SetMeal() {
    }
    public SetMeal(String mealName, double price, String fryChiCkenName, String drinkName) {
        this.mealName = mealName;
        this.price = price;
        this.fryChiCkenName = fryChiCkenName;
        this.drinkName = drinkName;
    }

    public String toString() {
        return "SetMeal{" +
                "mealName='" + mealName + '\'' +
                ", price=" + price +
                ", fryChiCkenName='" + fryChiCkenName + '\'' +
                ", drinkName='" + drinkName + '\'' +
                '}';
    }
}
