import java.util.Scanner;

public class Zadatak_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Neka prvi igrac unese svoje ime: ");
        String Igrac1 = sc.nextLine();
        System.out.println("Neka drugi igrac unese svoje ime: ");
        String Igrac2 = sc.nextLine();

        int poeniIgrac1 = 0;
        int poeniIgrac2 = 0;

        while (true) {

            for (int i = 1; i <= 15; i++) {

                System.out.printf("Krug %d\n", i);
                System.out.printf("%s: %d poena\n", Igrac1, poeniIgrac1);
                System.out.printf("%s: %d poena\n", Igrac2, poeniIgrac2);

                System.out.printf("%s, unesite ciljani broj poena: ", Igrac1);
                int brojPoenaUKruguI1 = Integer.parseInt(sc.nextLine());

                if (brojPoenaUKruguI1 < 1 || brojPoenaUKruguI1 > 20) {

                    System.out.printf("%s, promašili ste metu i ostajete bez poena u ovom krugu!\n", Igrac1);

                } else {

                    double broj1 = Math.random();
                    int randomBroj1 = (int) (broj1 * 100 + 1);

                    if (randomBroj1 <= 30) {

                        System.out.printf("%s, promašili ste metu i ostajete bez poena u ovom krugu!\n", Igrac1);

                    }

                    if (randomBroj1 >= 31 && randomBroj1 <= 50) {

                        System.out.printf("%s, osvojili ste %d poena u ovom krugu!\n", Igrac1, brojPoenaUKruguI1 * 3);
                        poeniIgrac1 += brojPoenaUKruguI1 * 3;

                        if (poeniIgrac1 == poeniIgrac2) {

                            poeniIgrac2 = 0;
                            System.out.printf("%s, izjednacili ste broj poena sa %s!\n", Igrac1, Igrac2);
                            System.out.printf("%s, Vas broj poena se resetuje na %d poena!\n", Igrac2, poeniIgrac2);

                        }

                        if (poeniIgrac1 > 201) {

                            poeniIgrac1=poeniIgrac1 - brojPoenaUKruguI1*3;
                            System.out.printf("%s, prebacili ste 201 poen! Ostajete na %d poena!\n", Igrac1, poeniIgrac1);
                        }
                    }

                    if (randomBroj1 >= 51 && randomBroj1 <= 80) {

                        System.out.printf("%s, osvojili ste %d poena u ovom krugu!\n", Igrac1, brojPoenaUKruguI1 * 2);
                        poeniIgrac1 += brojPoenaUKruguI1 * 2;

                        if (poeniIgrac1 == poeniIgrac2) {

                            poeniIgrac2 = 0;
                            System.out.printf("%s, izjednacili ste broj poena sa %s!\n", Igrac1, Igrac2);
                            System.out.printf("%s, Vas broj poena se resetuje na %d poena!\n", Igrac2, poeniIgrac2);

                        }

                        if (poeniIgrac1 > 201) {

                            poeniIgrac1=poeniIgrac1 - brojPoenaUKruguI1*2;
                            System.out.printf("%s, prebacili ste 201 poen! Ostajete na %d poena!\n", Igrac1, poeniIgrac1);
                        }
                    }

                    if (randomBroj1 >= 81 && randomBroj1 <= 100) {

                        System.out.printf("%s, osvojili ste %d poena u ovom krugu!\n", Igrac1, brojPoenaUKruguI1);
                        poeniIgrac1 += brojPoenaUKruguI1;

                        if (poeniIgrac1 == poeniIgrac2) {

                            poeniIgrac2 = 0;
                            System.out.printf("%s, izjednacili ste broj poena sa %s!\n", Igrac1, Igrac2);
                            System.out.printf("%s, Vas broj poena se resetuje na %d poena!\n", Igrac2, poeniIgrac2);

                        }

                        if (poeniIgrac1 > 201) {

                            poeniIgrac1=poeniIgrac1 - brojPoenaUKruguI1;
                            System.out.printf("%s, prebacili ste 201 poen! Ostajete na %d poena!\n", Igrac1, poeniIgrac1);
                        }
                    }

                    if (poeniIgrac1 == 201) {

                        System.out.printf("%s, pobedili ste, cestitamo!", Igrac1);
                        return;
                    }



                }


                System.out.printf("%s, unesite ciljani broj poena: ", Igrac2);
                int brojPoenaUKruguI2 = Integer.parseInt(sc.nextLine());

                if (brojPoenaUKruguI2 < 1 || brojPoenaUKruguI2 > 20) {

                    System.out.printf("%s, promašili ste metu i ostajete bez poena u ovom krugu!\n", Igrac2);

                } else {

                    double broj2 = Math.random();
                    int randomBroj2 = (int) (broj2 * 100 + 1);

                    if (randomBroj2 <= 30) {

                        System.out.printf("%s, promašili ste metu i ostajete bez poena u ovom krugu!\n", Igrac2);

                    }

                    if (randomBroj2 <= 50 && randomBroj2 >= 31) {

                        System.out.printf("%s, osvojili ste %d poena u ovom krugu!\n", Igrac2, brojPoenaUKruguI2 * 3);
                        poeniIgrac2 += brojPoenaUKruguI2 * 3;

                        if (poeniIgrac1 == poeniIgrac2) {

                            poeniIgrac1 = 0;
                            System.out.printf("%s, izjednacili ste broj poena sa %s!\n", Igrac2, Igrac1);
                            System.out.printf("%s, Vas broj poena se resetuje na %d poena!\n", Igrac1, poeniIgrac1);

                        }

                        if (poeniIgrac2 > 201) {

                            poeniIgrac2=poeniIgrac2 - brojPoenaUKruguI2*3;
                            System.out.printf("%s, prebacili ste 201 poen! Ostajete na %d poena!\n", Igrac2, poeniIgrac2);
                        }
                    }

                    if (randomBroj2 <= 80 && randomBroj2 >= 51) {

                        System.out.printf("%s, osvojili ste %d poena u ovom krugu!\n", Igrac2, brojPoenaUKruguI2 * 2);
                        poeniIgrac2 += brojPoenaUKruguI2 * 2;

                        if (poeniIgrac1 == poeniIgrac2) {

                            poeniIgrac1 = 0;
                            System.out.printf("%s, izjednacili ste broj poena sa %s!\n", Igrac2, Igrac1);
                            System.out.printf("%s, Vas broj poena se resetuje na %d poena!\n", Igrac1, poeniIgrac1);

                        }

                        if (poeniIgrac2 > 201) {

                            poeniIgrac2=poeniIgrac2 - brojPoenaUKruguI2*2;
                            System.out.printf("%s, prebacili ste 201 poen! Ostajete na %d poena!\n", Igrac2, poeniIgrac2);
                        }
                    }

                    if (randomBroj2 <= 100 && randomBroj2 >= 81) {

                        System.out.printf("%s, osvojili ste %d poena u ovom krugu!\n", Igrac2, brojPoenaUKruguI2);
                        poeniIgrac2 += brojPoenaUKruguI2;

                        if (poeniIgrac1 == poeniIgrac2) {

                            poeniIgrac1 = 0;
                            System.out.printf("%s, izjednacili ste broj poena sa %s!\n", Igrac2, Igrac1);
                            System.out.printf("%s, Vas broj poena se resetuje na %d poena!\n", Igrac1, poeniIgrac1);

                        }

                        if (poeniIgrac2 > 201) {

                            poeniIgrac2=poeniIgrac2 - brojPoenaUKruguI2;
                            System.out.printf("%s, prebacili ste 201 poen! Ostajete na %d poena!\n", Igrac2, poeniIgrac2);
                        }
                    }


                    if (poeniIgrac2 == 201) {

                        System.out.printf("%s, pobedili ste, cestitamo!", Igrac2);
                        return;
                    }



                }

            }

                    if (poeniIgrac1 > poeniIgrac2) {

                        System.out.printf("%s, pobedili ste sa osvojenih %d poena! Cestitamo!", Igrac1, poeniIgrac1);
                        return;

                    } else {

                        System.out.printf("%s, pobedili ste sa osvojenih %d poena! Cestitamo!", Igrac2, poeniIgrac2);
                        return;

                    }

                }

            }
        }





