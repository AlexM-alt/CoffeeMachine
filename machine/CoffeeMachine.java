package machine;

/**
 * Main claass aplication Coffee Machine.
 * This program can generate typical operations coffee machine.
 *
 * @author Aleksander Micyk
 * @version 1.0.1
 */


public class CoffeeMachine {
    public static void main(String[] args) {


        do {
            Menu menu = new Menu();
            menu.writeMenu();
            OperationCoffee oC = new OperationCoffee();
            System.out.println();
        } while (!OperationCoffee.exit);


    }
}




