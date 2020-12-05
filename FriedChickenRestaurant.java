package WesterFriendChickenRestaurant;

public interface FriedChickenRestaurant {
    public  void sellMeal(SetMeal meal) throws IngredientSortOutException;

    public  void bulkPurchase(Drinks drinks);


}