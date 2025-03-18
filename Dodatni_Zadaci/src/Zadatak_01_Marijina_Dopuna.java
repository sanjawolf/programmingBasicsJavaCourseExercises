import java.util.Scanner;

    public class Zadatak_01_Marijina_Dopuna {

        public static void main(String[] args) {
            System.out.println("Unesite broj poena za heroja: ");
            Scanner sc=new Scanner(System.in);

            int pocetniBrojHPIgrac=Integer.parseInt(sc.nextLine());
            System.out.println("Unesite broj poena za zmaja: ");
            int pocetniBrojHPZmaj=Integer.parseInt(sc.nextLine());

            if(pocetniBrojHPIgrac<=0){
                System.out.println("Heroj nije živ! Unesite pozitivan broj HP!");
            }

            if(pocetniBrojHPZmaj<=0){
                System.out.println("Zmaj nije živ! Unesite pozitivan broj HP!");
            }

            int brojZalecenja=0;

            while(true){

                System.out.printf("Heroj: %d HP\n", pocetniBrojHPIgrac);
                System.out.printf("Zmaj: %d HP\n", pocetniBrojHPZmaj);
                System.out.println("Dozvoljeni potezi: 1 - napad mačem");
                System.out.println("Dozvoljeni potezi: 2 - napad munjom");
                System.out.println("Dozvoljeni potezi: 3 - odbrana štitom");
                System.out.println("Dozvoljeni potezi: 4 - lečenje");
                System.out.println("Unesite broj poteza: ");
                String opcija=sc.nextLine();

                double broj = Math.random();
                int randomBroj = (int)(broj*100+1);

                switch(opcija){
                    case "1":
                        if(randomBroj<=75){
                            randomBroj=(int) (broj * (15 - 10)) + 10;
                            pocetniBrojHPZmaj-=randomBroj;
                            System.out.printf("Zmaj je pogođen! Zadali ste mu %d HP!\n", randomBroj);
                        }
                        else{
                            System.out.println("Promašili ste! Više sreće drugi put!");
                        }
                        if(randomBroj<=20){
                            pocetniBrojHPZmaj-=0.5*randomBroj;
                        }
                        if(pocetniBrojHPZmaj<=0){
                            System.out.println("Pobedili ste!");
                            System.out.println("* * * * * IGRA JE ZAVRŠENA! * * * * *");
                            return;
                        }
                        break;
                    case "2":
                        if(randomBroj<=50){
                            randomBroj=(int) (broj * (30 - 15)) + 15;
                            pocetniBrojHPZmaj-=randomBroj;
                            System.out.printf("Zmaj je pogođen! Zadali ste mu %d HP!\n", randomBroj);
                        }
                        else{
                            System.out.println("Promašili ste! Više sreće drugi put!");
                        }
                        if(randomBroj<=20){
                            pocetniBrojHPZmaj-=0.5*randomBroj;
                        }
                        if(pocetniBrojHPZmaj<=0){
                            System.out.println("Pobedili ste!");
                            return;
                        }
                        break;
                    case "3":
                        if(randomBroj<=25){
                            randomBroj=(int) (broj * (15 - 5)) + 5;
                            pocetniBrojHPZmaj-=randomBroj;
                            System.out.printf("Zmaj je pogođen! Zadali ste mu %d HP!\n", randomBroj);
                        }
                        else{
                            System.out.println("Promašili ste! Više sreće drugi put!");
                        }
                        if(randomBroj<=20){
                            pocetniBrojHPZmaj-=0.5*randomBroj;
                        }
                        if(pocetniBrojHPZmaj<=0){
                            System.out.println("POBEDILI STE!");
                            return;
                        }
                        break;
                    case "4":
                        if(brojZalecenja==2){
                            System.out.println("Iskorišćeno zalečenje!");
                            break;
                        }
                        randomBroj=(int) (broj * (35 - 15)) + 15;
                        pocetniBrojHPIgrac+=randomBroj;
                        brojZalecenja++;
                        break;
                    default:
                        System.out.println("Uneli ste nedozvoljen broj.");
                }
                randomBroj=(int) (broj * (17 - 7)) + 7;
                pocetniBrojHPIgrac-=randomBroj;
                System.out.printf("Zmaj uzvraća udarac! Zadao vam je %d HP!\n", randomBroj);
                if(pocetniBrojHPIgrac<=0){
                    System.out.println("Zmaj je pobedio!");
                    break;
                }
            }
        }
    }


