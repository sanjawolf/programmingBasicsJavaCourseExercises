public class Zadatak_03_4_Petlje {

    public static void main(String[] args) {

        int sat, minut, sekund;

        for(sat=0; sat<=23; sat++){

            for(minut=0; minut<=59; minut++){

                for(sekund=0; sekund<=59; sekund++){

                        System.out.printf("%02d:%02d:%02d\n", sat, minut, sekund);
                }
            }
        }
    }
}
