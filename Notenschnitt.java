import java.math.*;

public class Arrraytentofifteen {

    public static void main(String[] args) {

        int[] noten = new int[25];
        int einser = 0;
        int zweier = 0;
        int dreier = 0;
        int vierer = 0;
        int fuenfer = 0;
        int sechser = 0;


        for ( int i = 0; i < 25; i++) {

            double kommazahl = Math.random();
            if (kommazahl < 0.166666) {
                noten[i] = 1;
            } else if (kommazahl < 0.333333) {
                noten[i] = 2;
            } else if (kommazahl < 0.5) {
                noten[i] = 3;
            } else if (kommazahl < 0.666666) {
                noten[i] = 4;
            } else if (kommazahl < 0.833333) {
                noten[i] = 5;
            } else if (kommazahl < 1) {
                noten[i] = 6;
            }
            System.out.print(noten[i]);

            if (noten[i] == 1) {
                einser++;
            } else if (noten[i] == 2) {
                zweier++;
            } else if (noten[i] == 3) {
                dreier++;
            } else if (noten[i] == 4) {
                vierer++;
            } else if (noten[i] == 5) {
                fuenfer++;
            } else if (noten[i] == 6) {
                sechser++;
            }

        }
        System.out.println();
        System.out.println(einser + "x Note 1");
        System.out.println(zweier + "x Note 2");
        System.out.println(dreier + "x Note 3");
        System.out.println(vierer + "x Note 4");
        System.out.println(fuenfer + "x Note 5");
        System.out.println(sechser + "x Note 6");

        float notenschnitt = (einser * 1 + zweier * 2 + dreier * 3 + vierer * 4 + fuenfer * 5 + sechser * 6) / 25f;
        System.out.println("Der Notenschnitt beträgt: " + notenschnitt);


        }
        
    }
