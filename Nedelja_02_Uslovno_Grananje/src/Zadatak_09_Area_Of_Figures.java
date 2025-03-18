import java.util.Scanner;

public class Zadatak_09_Area_Of_Figures {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String figure=sc.nextLine();

        if(figure.equals("square")){

            double length=Double.parseDouble(sc.nextLine());
            double area_of_square=length*length;
            System.out.printf("%.3f", area_of_square);
        }

        if(figure.equals("rectangle")){

            double length_of_rec=Double.parseDouble(sc.nextLine());
            double width=Double.parseDouble(sc.nextLine());
            double area_of_rec=length_of_rec*width;
            System.out.printf("%.3f", area_of_rec);
        }

        if(figure.equals("circle")){

            double radius=Double.parseDouble(sc.nextLine());
            double area_of_circle=radius*radius*Math.PI;
            System.out.printf("%.3f", area_of_circle);
        }

        if(figure.equals("triangle")){

            double side=Double.parseDouble(sc.nextLine());
            double height=Double.parseDouble(sc.nextLine());
            double area_of_triangle=side*height/2;
            System.out.printf("%.3f", area_of_triangle);
        }


    }
}
