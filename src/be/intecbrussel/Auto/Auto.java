package be.intecbrussel.Auto;

public class Auto {

    public String merknaam;
    public String numberplaat;
    public Auto motor;


    public String toString(){

        return merknaam + " met kenteken " + numberplaat;
    }

    public void toonToerental(){

    }

    public void rem(){

    }

    public int geefGas(int gas){

       return gas;
    }

    public void geefGas(){

       int speed = 200;
       for (int i = 0; i < 5800; i+=speed);
    }

    public Auto (Auto motor){

        this.motor = motor;
    }

    public Auto (String merknaam){

        this.merknaam = merknaam;
    }

    public Auto (String merknaam, String numberplaat){

        this.merknaam = merknaam;
        this.numberplaat = numberplaat;
    }
}
