import java.util.Scanner;

public class Zadatak_15_ALGORITAM_ZA_PREBROJAVANJE {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int i;
        int brojacPrelaznih=0;
        int brojacNeprelaznih=0;
        int brojacNeispravnih=0;

        for(i=1; i<=n; i++){

            int ocena=Integer.parseInt(sc.nextLine());

            if(ocena==1){

                brojacNeprelaznih=brojacNeprelaznih+1;
            }

            else if(ocena<=5 && ocena>=2)

            {

                brojacPrelaznih=brojacPrelaznih+1;
            }

            else{

                brojacNeispravnih=brojacNeispravnih+1;

            }
        }

        System.out.println("Broj đaka sa prelaznim ocenama: "+brojacPrelaznih);
        System.out.println("Broj đaka sa nedovoljnim ocenama: "+brojacNeprelaznih);
        System.out.println("Broj đaka sa neispravnim ocenama: "+brojacNeispravnih);
    }
}
