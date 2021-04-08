package FirstStepsInCodingExercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfBakers = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());


        double costOfCake = numberOfCakes * 45;
        double costOfWaffles = numberOfWaffles * 5.8;
        double costOfPancakes = numberOfPancakes * 3.2;

        double costPerBaker = (costOfCake + costOfPancakes + costOfWaffles) * numberOfBakers;
        double totalMoneyRaised = costPerBaker * numberOfDays;
        double expenses = totalMoneyRaised / 8;
        double totalProfit = totalMoneyRaised - expenses;

        System.out.printf("%.2f", totalProfit);
    }
}
