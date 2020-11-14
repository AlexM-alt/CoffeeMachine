package machine;

/**
 * This class is responsible for keeping
 * of coffee magazine - water, milk, coffee beans, cost.
 *
 * @author Aleksander Micyk
 */
public class CoffeeMagazine {


    //state at the beginning.
    private static int totalMlWater = 400;
    private static int totalMlMilk = 540;
    private static int totalGCoffeeBeans = 120;
    private static int totalQualityCup = 9;
    private static int totalMoney = 550;


    /**
     * @return water inventory.
     */
    public static int getMlWater() {
        return totalMlWater;
    }

    /**
     * Keep adding the water to totalMlWater.
     *
     * @param mlWater the water that we can fill.
     */
    public static void updateMlWaterP(int mlWater) {
        totalMlWater += mlWater;
    }

    /**
     * Abtract the water inventory after selecting the appropriate cup of coffee.
     *
     * @param mlWater the water which we subtract after choosing a cup of coffee.
     */
    public static void updateMlWaterM(int mlWater) {
        totalMlWater -= mlWater;
    }


    /**
     * @return milk inventory.
     */
    public static int getMlMilk() {
        return totalMlMilk;
    }

    /**
     * Keep adding the milk to totalMlMilk.
     *
     * @param mlMilk the milk that we can fill.
     */
    public static void updateMlMilkP(int mlMilk) {
        totalMlMilk += mlMilk;
    }

    /**
     * Abtract the milk inventory after selecting the appropriate cup of coffee.
     *
     * @param mlMilk the milk which we subtract after choosing a cup of coffee.
     */
    public static void updateMlMilkM(int mlMilk) {
        totalMlMilk -= mlMilk;
    }


    /**
     * @return coffee beans inventory.
     */
    public static int getMlCoffeeBeans() {
        return totalGCoffeeBeans;
    }

    /**
     * Keep adding the coffee beans to totalGCoffeeBeans.
     *
     * @param mlCoffeeBeans the coffee beans that we can fill.
     */
    public static void updateMlCoffeeBeansP(int mlCoffeeBeans) {
        totalGCoffeeBeans += mlCoffeeBeans;
    }

    /**
     * Abtract the coffee beans inventory after selecting the appropriate cup of coffee.
     *
     * @param gCoffeeBeans the coffee beans which we subtract after choosing a cup of coffee.
     */
    public static void updateMlCoffeeBeansM(int gCoffeeBeans) {
        totalGCoffeeBeans -= gCoffeeBeans;
    }


    /**
     * @return quality cup inventory.
     */
    public static int getQualityCup() {
        return totalQualityCup;
    }

    /**
     * Keep adding the quality cup to totalQualityCup.
     *
     * @param qualityCup the quality cup that we can fill.
     */
    public static void updateQualityCup(int qualityCup) {
        totalQualityCup += qualityCup;
    }

    /**
     * Abtract the quality cup inventory after selecting the appropriate cup of coffee.
     *
     * @param qualityCup the quality cup which we subtract after choosing a cup of coffee.
     */
    public static void updateQualityCupM(int qualityCup) {
        totalQualityCup--;
    }


    /**
     * @return to money bank.
     */
    public static int getMoney() {
        return totalMoney;
    }

    /**
     * Money is added after selecting the appropriate cup of coffee.
     *
     * @param money add to money bank
     */
    public static void updateMoneyP(int money) {
        totalMoney += money;
    }

    /**
     * Abtract if we can take all money
     *
     * @param money money which we subtract after choosing "take".
     */
    public static void updateMoneyM(int money) {
        totalMoney -= money;
    }


}
