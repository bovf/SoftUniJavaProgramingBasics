package ConditionalStatements;

import java.util.Scanner;

public class PB6AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double area = 0;

        if (figure.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;

        }else if (figure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * (Math.pow(r, 2));

        }else if (figure.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2;

        }else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());

            area = a * b;
        }

        System.out.printf("%.3f", area);
    }
}
