public class Zadatak_02_Judge_Lab_02 {

    public static void main(String[] args) {

        int firstMultiplier, secondMultiplier;

        for(firstMultiplier=1; firstMultiplier<=10; firstMultiplier++){

            for(secondMultiplier=1; secondMultiplier<=10; secondMultiplier++){

                int product=firstMultiplier*secondMultiplier;

                System.out.printf("%d * %d = %d\n", firstMultiplier, secondMultiplier, product);
            }
        }
    }
}
