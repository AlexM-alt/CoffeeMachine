package machine;

/**
 * This class is responsible for keeping the track
 * of coffee cup - water, milk, coffee beans, cost.
 *
 * @author Aleksander Micyk
 */
public class CoffeeCup {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int cost;

    /**
     * Create a new coffee cup object.
     *
     * @param water       water of the coffee cup.
     * @param milk        milk of the coffee cup.
     * @param coffeeBeans coffee beans of the coffee cup.
     * @param cost        cost of the coffee cup.
     */
    public CoffeeCup(int water, int milk, int coffeeBeans, int cost) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cost = cost;
    }


    /**
     * @return water of the coffee cup.
     */
    public int getWater() {
        return water;
    }


    /**
     * @return milk of the coffee cup.
     */
    public int getMilk() {
        return milk;
    }


    /**
     * @return coffee beans of the coffee cup.
     */
    public int getCoffeeBeans() {
        return coffeeBeans;
    }


    /**
     * @return cost of the coffee cup.
     */
    public int getCost() {
        return cost;
    }


}
