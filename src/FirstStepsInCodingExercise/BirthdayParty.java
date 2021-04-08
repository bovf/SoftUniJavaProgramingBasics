package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        double priceOfCake = rent * 0.2;
        double priceOfDrinks = priceOfCake - priceOfCake * 0.45;
        double priceOfAnimator = (double) rent / 3;

        double totalPrice = priceOfAnimator + priceOfCake + priceOfDrinks + rent;

        System.out.printf("%.1f", totalPrice);
    }
}
