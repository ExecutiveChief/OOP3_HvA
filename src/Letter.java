
public class Letter {
    private char letter;

    public Letter(){
        this.letter = 'A';
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        letter = Character.toUpperCase(letter);
        this.letter = letter;
    }

    public void volgende(){
        if(this.letter == 'Z'){
            this.letter = 'A';
        } else {
            this.letter++;
        }
    }
}
