

public class Zadatak_08_trocifreni_brojevi_koji_imaju_samo_parne_cifre {

    public static void main(String[] args) {

        int stotine, desetice, jedinice;

        for(stotine=2; stotine<=9; stotine++){

            for(desetice=0; desetice<=9; desetice++){

                for(jedinice=0; jedinice<=9; jedinice++){

                    if(stotine%2==0 && desetice%2==0 && jedinice%2==0){

                        System.out.printf("%d%d%d\n", stotine, desetice, jedinice);
                    }
                }
            }
        }

    }
}
