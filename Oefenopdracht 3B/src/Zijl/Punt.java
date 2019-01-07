package Zijl;

public class Punt {
    private String naam = "";
    private int x;
    private int y;


    public Punt(){
        this.naam = "";
        this.x = 0;
        this.y = 0;

    }
    public Punt(String naam,int x, int y){
        this.naam = naam;
        this.x = x;
        this.y = y;
    }
    public String print(){
        String c = this.naam + "(" + this.x + "," + this.y + ")";
        return c;
    }

    public String verschuif(int deltaX, int deltaY){
        this.x = this.x + deltaX;
        this.y = this.y + deltaY;

        return print();


    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public String getNaam(){
        return this.naam;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

}
