package Zijl;

public class Veelhoek {
    private String naamPunt;
    private int aantalPunten;
    private Punt[] punt;


    public Veelhoek(String naamPunt, int aantalPunten) {
        this.naamPunt = naamPunt;
        this.aantalPunten = aantalPunten;
        punt = new Punt[aantalPunten];
        for (int i = 0; i < aantalPunten; i++) {
            punt[i] = new Punt();
        }


    }


    public String print() {
        String b = "Hoek " + this.naamPunt + " Heeft " + aantalPunten + " Punten";
        return b;


    }

    public String printCord(int welkPunt){
        String c = "";
        c = " (" + punt[welkPunt].getX() + "," + punt[welkPunt].getY() + ") ";
        return c;
    }


    public void setPunt(int puntPoint, int x, int y) {
        punt[puntPoint].setX(x);
        punt[puntPoint].setY(y);
    }

    public void verschuif(int welkPunt,int deltaX,int deltaY){
        punt[welkPunt].verschuif(deltaX,deltaY);
    }

}



