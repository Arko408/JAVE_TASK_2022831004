package practice_problem_08;

public abstract class restaurant_b
{
    String name;
    double foodPrice;

    restaurant_b(String name, double foodPrice) {
        this.name = name;
        this.foodPrice = foodPrice;
    }

    double calculateTotalBill() {
        double tax = foodPrice * 0.10;
        return foodPrice + tax;
    }

    int estimateDeliveryTime() {
        return 40;
    }
}
