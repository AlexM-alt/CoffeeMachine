package machine;

import java.util.Scanner;

/**
 * This class shows the user the possibilities coffee machine.
 *
 * @author Aleksander Micyk
 */
public class Menu {

    //The method show menu choose
    void writeMenu() {

        System.out.println();
        OperationCoffee op = new OperationCoffee();
        op.menuChoose();

    }

    //The method that show status machine.
    public void statusMachine() {
        System.out.println( "The coffee machine has:" );
        System.out.println( CoffeeMagazine.getMlWater() + " of water" );
        System.out.println( CoffeeMagazine.getMlMilk() + " of milk" );
        System.out.println( CoffeeMagazine.getMlCoffeeBeans() + " of coffee beans" );
        System.out.println( CoffeeMagazine.getQualityCup() + " of dispose cups" );
        System.out.println( CoffeeMagazine.getMoney() + " of money" );
    }


    // The method of filling.
    public void updatingStatusMagazyn() {
        Scanner scanner = new Scanner( System.in );


        System.out.println( "Write how many ml of water do you want to add:" );
        int mlWater = scanner.nextInt();
        CoffeeMagazine.updateMlWaterP( mlWater );


        System.out.println( "Write how many ml of milk do you want to add: " );
        int mlMilk = scanner.nextInt();
        CoffeeMagazine.updateMlMilkP( mlMilk );


        System.out.println( "Write how many grams of coffee beans do you want to add: " );
        int mlCoffeeBeans = scanner.nextInt();
        CoffeeMagazine.updateMlCoffeeBeansP( mlCoffeeBeans );


        System.out.println( "Write how many disposable cups of coffee do you want to add: " );
        int quality = scanner.nextInt();
        CoffeeMagazine.updateQualityCup( quality );

    }

}
