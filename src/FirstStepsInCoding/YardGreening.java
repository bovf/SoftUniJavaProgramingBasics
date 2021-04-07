package FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double cubicMetres = Double.parseDouble(scanner.nextLine());

        double cost = cubicMetres * 7.61;
        double discount = cost * 18 / 100;
        double totalCost = cost - discount;

        System.out.printf("The final price is: %.2f lv.\n" +
                "The discount is: %.2f lv.", totalCost, discount);
    }
}
