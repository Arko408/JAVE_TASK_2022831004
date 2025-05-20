package practice_problem_08;

public class fast_food_restaurants_b extends restaurant_b
{
    fast_food_restaurants_b(String name, double foodPrice) {
        super(name, foodPrice);
    }

    @Override
    double calculateTotalBill() {
        double tax = foodPrice * 0.15;
        return foodPrice + tax;
    }

    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}
