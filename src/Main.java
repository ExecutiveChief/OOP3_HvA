/*
    Dit programma is gemaakt als opdracht voor de HvA. Hierbij moest er een kofferslot gebouwd worden.
    Hierbij geldt dat het een combinatie van twee letters is en een cijfer.
    Als het cijfer wordt opgehoogd als het 9 is gaat de laatste letter omhoog. Als de laatste letter 'Z' is en wordt
    opgehoogd gaat het eerste letter omhoog.


   @author : Irmo Keulen
   @Date : 01-april-2019
   @Assignment : HvA OOP 3A


 */

public class Main {

    public static void main(String[] args) {
        /*
            Dit is puur ter check van de output.
         */

        Kofferslot koffer1 = new Kofferslot('A', 'A', 0);
        Kofferslot koffer2 = new Kofferslot('B', 'R', 9);
        Kofferslot koffer3 = new Kofferslot('D', 'Z', 9);
        Kofferslot koffer4 = new Kofferslot('Z', 'Z', 9);

        check(koffer1);
        check(koffer2);
        check(koffer3);
        check(koffer4);

    }

    private static void check(Kofferslot koffer) {
        Letter[] hello = koffer.getLetterlijst();
        Cijfer cijfer = koffer.getCijfer();

        System.out.print(hello[0].getLetter());
        System.out.print(hello[1].getLetter());
        System.out.print(cijfer.getCijfer() + " volgende moet zijn: ");

        koffer.volgende();

        System.out.print(hello[0].getLetter());
        System.out.print(hello[1].getLetter());
        System.out.println(cijfer.getCijfer());
    }
}
