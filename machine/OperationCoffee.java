package machine;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is responsible for keeping logical
 * application machine coffee.
 *
 * @author Aleksander Micyk
 */
public class OperationCoffee extends Menu {

    public static boolean exit = false; // variable use to ending a program


    //The method responsible for selecting the appropriate command.
    public void menuChoose() {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Write action (buy, fill, take, remaining, exit):" );

        String choose = scanner.nextLine();

        switch (choose) {
            case "buy":
                System.out.println( "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: " );

                try {

                    int chooseCoffee = scanner.nextInt();

                    switch (chooseCoffee) {
                        case 1:   // espresso

                            CoffeeCup espresso = new CoffeeCup( 250, 0, 16, 4 );

                            if (espresso.getWater() > CoffeeMagazine.getMlWater()) {
                                System.out.println( "Sorry, not enough water!" );
                                break;
                            } else if (espresso.getMilk() > CoffeeMagazine.getMlMilk()) {
                                System.out.println( "Sorry, not enough milk!" );
                                break;
                            } else if (espresso.getCoffeeBeans() > CoffeeMagazine.getMlCoffeeBeans()) {
                                System.out.println( "Sorry, not enough coffe beans!" );
                                break;
                            } else if (CoffeeMagazine.getQualityCup() < 1) {
                                System.out.println( "Sorry, not enough cup!" );
                                break;
                            } else {
                                System.out.println( "I have enough resources, making you a coffee!" );

                                CoffeeMagazine.updateMlWaterM( espresso.getWater() );
                                CoffeeMagazine.updateMlMilkM( espresso.getMilk() );
                                CoffeeMagazine.updateMlCoffeeBeansM( espresso.getCoffeeBeans() );
                                CoffeeMagazine.updateQualityCupM( 1 );
                                CoffeeMagazine.updateMoneyP( espresso.getCost() );
                            }

                            break;

                        case 2:   // latte

                            CoffeeCup latte = new CoffeeCup( 350, 75, 20, 7 );

                            if (latte.getWater() > CoffeeMagazine.getMlWater()) {
                                System.out.println( "Sorry, not enough water!" );
                                break;
                            } else if (latte.getMilk() > CoffeeMagazine.getMlMilk()) {
                                System.out.println( "Sorry, not enough milk!" );
                                break;
                            } else if (latte.getCoffeeBeans() > CoffeeMagazine.getMlCoffeeBeans()) {
                                System.out.println( "Sorry, not enough coffe beans!" );
                                break;
                            } else if (CoffeeMagazine.getQualityCup() < 1) {
                                System.out.println( "Sorry, not enough cup!" );
                                break;
                            } else {
                                System.out.println( "I have enough resources, making you a coffee!" );

                                CoffeeMagazine.updateMlWaterM( latte.getWater() );
                                CoffeeMagazine.updateMlMilkM( latte.getMilk() );
                                CoffeeMagazine.updateMlCoffeeBeansM( latte.getCoffeeBeans() );
                                CoffeeMagazine.updateQualityCupM( 1 );
                                CoffeeMagazine.updateMoneyP( latte.getCost() );
                            }


                            break;


                        case 3:   // cappuccino


                            CoffeeCup cappuccino = new CoffeeCup( 200, 100, 12, 6 );


                            if (cappuccino.getWater() > CoffeeMagazine.getMlWater()) {
                                System.out.println( "Sorry, not enough water!" );
                                break;
                            } else if (cappuccino.getMilk() > CoffeeMagazine.getMlMilk()) {
                                System.out.println( "Sorry, not enough milk!" );
                                break;
                            } else if (cappuccino.getCoffeeBeans() > CoffeeMagazine.getMlCoffeeBeans()) {
                                System.out.println( "Sorry, not enough coffe beans!" );
                                break;
                            } else if (CoffeeMagazine.getQualityCup() < 1) {
                                System.out.println( "Sorry, not enough cup!" );
                                break;
                            } else {
                                System.out.println( "I have enough resources, making you a coffee!" );

                                CoffeeMagazine.updateMlWaterM( cappuccino.getWater() );
                                CoffeeMagazine.updateMlMilkM( cappuccino.getMilk() );
                                CoffeeMagazine.updateMlCoffeeBeansM( cappuccino.getCoffeeBeans() );
                                CoffeeMagazine.updateQualityCupM( 1 );
                                CoffeeMagazine.updateMoneyP( cappuccino.getCost() );
                            }


                            break;


                        default:
                            System.out.println( "Zła wartość" );
                            break;
                    }

                } catch (InputMismatchException e) {
                    menuChoose();
                    e.printStackTrace();


                }
                break;
            case "fill":

                updatingStatusMagazyn();
                break;

            case "take":
                System.out.println( "I gave you " + CoffeeMagazine.getMoney() );
                CoffeeMagazine.updateMoneyM( CoffeeMagazine.getMoney() );
                break;

            case "remaining":
                statusMachine();
                break;

            case "exit":
                exit = true;

        }
    }


}
