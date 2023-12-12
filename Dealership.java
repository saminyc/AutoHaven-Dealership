
import java.util.Scanner;

public class Dealership {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the AutoHaven");
        System.out.println("Select option 'a' to buy a car");
        System.out.println("Select option 'b' to sell a car");

        String user_option_chosen = sc.nextLine();

        switch (user_option_chosen) {

            // buying a car
            case "a":
                System.out.println("You have chosen option " + user_option_chosen);
                System.out.println("What is your budget?");
                Double budget = sc.nextDouble();

                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available for you!");
                    System.out.println("Do you have insurance? Write 'yes' or 'no'");
                    sc.nextLine();
                    String insurance = sc.nextLine();
                    System.out.println("Do you have a license? Write 'yes' or 'no'");
                    String licence = sc.nextLine();
                    System.out.println("What is your credit score?");
                    int creditScore = sc.nextInt();

                    if (insurance.equals("yes") && licence.equals("yes") && creditScore >= 660) {
                        System.out.print("Sold! Pleasure doing business with you! 🤝");
                    } else {
                        System.out.println("Sorry we are not able to sell you a car.😢");
                    }
                } else {
                    System.out.println("We're sorry. You are not eligible");
                }
                break;

            case "b":
                System.out.println("You have chosen option " + user_option_chosen);
                System.out.println("What is your car valued at?");
                int market_value = sc.nextInt();
                System.out.println("What is your selling price");
                double asking_price = sc.nextDouble();

                if (market_value > asking_price && asking_price < 30000) {
                    System.out.println("We will buy your car. Pleasure doing business with you!😎");
                } else {
                    System.out.println("Sorry our interests do not align for the offer.😢");
                }
                break;

            default:
                System.out.println("Invalid Option " + user_option_chosen);
                break;
        }

        sc.close();

    }

}