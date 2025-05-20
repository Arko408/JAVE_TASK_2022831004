package practice_problem_08;

public class fine_dining_restaurant_b extends restaurant_b
{
    fine_dining_restaurant_b(String name, double foodPrice) {
        super(name, foodPrice);
    }

    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}
