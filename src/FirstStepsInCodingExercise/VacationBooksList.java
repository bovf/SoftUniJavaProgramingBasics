package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int hoursNeeded = numberOfPages / pagesPerHour;
        int hoursPerDay = hoursNeeded / numberOfDays;

        System.out.println(hoursPerDay);
    }
}
