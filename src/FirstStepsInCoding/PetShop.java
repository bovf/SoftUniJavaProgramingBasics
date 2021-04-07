package FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOfOtherAnimals = Integer.parseInt(scanner.nextLine());

        double costForDogs = 2.50 * numberOfDogs;
        int costForOtherAnimals = 4 * numberOfOtherAnimals;
        double totalCost = costForDogs + costForOtherAnimals;

        System.out.printf("%.2f lv.", totalCost);
    }
}
