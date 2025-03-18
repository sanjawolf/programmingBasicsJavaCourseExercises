import java.util.Scanner;

public class Zadatak_00_Podsetnik {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int dobiliDevetku=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int brojStudenata=0;
        int ukupanBrojPoena=0;

        while(true){

            String brojPoenaTekst=sc.nextLine();

            if(brojPoenaTekst.equals("KRAJ")){

                break;
            }

            int brojPoena=Integer.parseInt(brojPoenaTekst);

            brojStudenata++;
            ukupanBrojPoena=ukupanBrojPoena+brojPoena;

            if(brojPoena>=85 && brojPoena<94){

                dobiliDevetku++;
            }

            if(brojPoena>max){

                max=brojPoena;
            }

            if(brojPoena<min){

                min=brojPoena;
            }

        }

        double avg=(double)ukupanBrojPoena/brojStudenata;
        System.out.printf("Ocenu 9 je dobilo %d studenata.\n", dobiliDevetku);
        System.out.printf("Student sa najvise poena je imao %d poena.\n", max);
        System.out.printf("Student sa najmanje poena je imao %d poena.\n", min);
        System.out.printf("Prosecan broj poena studenta na ispitu je %.2f.", avg);

    }
}
