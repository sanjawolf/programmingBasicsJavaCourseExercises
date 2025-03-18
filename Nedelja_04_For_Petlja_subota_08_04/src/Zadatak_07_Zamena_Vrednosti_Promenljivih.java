

public class Zadatak_07_Zamena_Vrednosti_Promenljivih {

    public static void main(String[] args) {

        int x=10;
        int y=5;

        int x_1=x;
        x=y;
        y=x_1;

        System.out.printf("Promenljiva x: %d\n", x);
        System.out.printf("Promenljiva y: %d", y);
    }

}
