import java.util.Scanner;

public class Zadatak_38_Practice_38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        double area = -1;

        switch (type) {

            case "square":
                double length = Double.parseDouble(sc.nextLine());
                area = Math.pow(length, 2);
                System.out.printf("%.3f", area);
                break;

            case "rectangle":
                double a = Double.parseDouble(sc.nextLine());
                double b = Double.parseDouble(sc.nextLine());
                area = a * b;
                System.out.printf("%.3f", area);
                break;

            case "circle":
                double radius = Double.parseDouble(sc.nextLine());
                area = Math.pow(radius, 2) * Math.PI;
                System.out.printf("%.3f", area);
                break;

            case "triangle":
                double aha = Double.parseDouble(sc.nextLine());
                double height = Double.parseDouble(sc.nextLine());
                area = aha * height / 2;
                System.out.printf("%.3f", area);
                break;

            default:


        }
    }
}
