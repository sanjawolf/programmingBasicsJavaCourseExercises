import java.util.Scanner;

public class Zadatak_09_Aritmeticke_Operacije {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int prviCeoBroj=Integer.parseInt(sc.nextLine());

        System.out.println("Unesi drugi broj: ");
        int drugiCeoBroj=Integer.parseInt(sc.nextLine());

        //System.out.println("Stringovi: "+(prviBroj+drugiBroj));

        int zbir=prviCeoBroj+drugiCeoBroj;
        int razlika=prviCeoBroj-drugiCeoBroj;
        int proizvod=prviCeoBroj*drugiCeoBroj;
        int celobrojniKolicnik=prviCeoBroj/drugiCeoBroj;
        int ostatakPriDeljenju=prviCeoBroj%drugiCeoBroj;

        System.out.println("Zbir unetih brojeva je: "+(prviCeoBroj+"+"+drugiCeoBroj+"="+zbir));
        System.out.println("Razlika unetih brojeva je: "+(prviCeoBroj+"-"+drugiCeoBroj+"="+razlika));
        System.out.println("Proizvod unetih brojeva je: "+(prviCeoBroj+"*"+drugiCeoBroj+"="+proizvod));
        System.out.println("Celobrojni količnik unetih brojeva je: "+(prviCeoBroj+"/"+drugiCeoBroj+"="+celobrojniKolicnik));
        System.out.println("Ostatak pri deljenju unetih brojeva je: "+(prviCeoBroj+"%"+drugiCeoBroj+"="+ostatakPriDeljenju));

        double kolicnik=(double)prviCeoBroj/drugiCeoBroj;
        System.out.println("Kolicnik unetih brojeva je: "+(prviCeoBroj+"/"+drugiCeoBroj+"="+kolicnik));
    }
}
