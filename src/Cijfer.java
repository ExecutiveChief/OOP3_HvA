public class Cijfer {
    private int cijfer;

    public Cijfer(){
        this.cijfer = 0;
    }

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }

    public void volgende(){
        if(this.cijfer > 9){
            setCijfer(0);
        } else {
            this.cijfer++;
        }
    }
}
