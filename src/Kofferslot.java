public class Kofferslot {
    /*
        Een kofferslot combinatie bestaat uit 2 letters (eerste twee posities) en de 1 cijfer (laatste positie)
        Als een letter of getal wordt opgehoogd als het de hoogste waarde heeft (i.e. cijfer = 9) wordt dit terug gezet
        naar de laagste positie en wordt de positie daarvoor opgehoogd.
     */
    private Letter[] letterlijst = new Letter[2];
    private Cijfer cijfer;

    public Kofferslot(){
        /*
            indien er niks wordt meegegeven bij het initializing
            waardes zijn : AA0
         */
        letterlijst[0] = new Letter();
        letterlijst[1] = new Letter();
        this.cijfer = new Cijfer();
    }

    public Kofferslot(char firstLetter, char secondLetter, int cijfer){
        /*
            Indien bij het creeeren van de een kofferslot object params wordt meegegeven.
            @param firstLetter : letter eerste positie
            @param secondLetter : letter tweede positie
            @param cijfer : cijfer laatste positie
         */

        this.letterlijst[0] = new Letter();
        this.letterlijst[1] = new Letter();
        this.cijfer = new Cijfer();

        this.letterlijst[0].setLetter(firstLetter);
        this.letterlijst[1].setLetter(secondLetter);
        this.cijfer.setCijfer(cijfer);

    }
    public void volgende(){
        if(cijfer.getCijfer() == 9){ // tweede posite wordt aangepast als 9 geincrement wordt.
            this.cijfer.volgende();
            this.letterlijst[1].volgende();

            if(this.letterlijst[1].getLetter() == 'A'){//eerste positie wordt aangepast als Z (tweede posite) geincrement wordt
                this.letterlijst[0].volgende();
            }

        }
        this.cijfer.volgende();

    }

    public Cijfer getCijfer() {
        return cijfer;
    }

    public Letter[] getLetterlijst() {
        return letterlijst;
    }
}
