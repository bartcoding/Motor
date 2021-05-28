package be.intecbrussel.Auto;

public class Motor {

    private int MAX_TOERENTAL = 5800;
    private int toerental;




    public Motor(int speed){
        for (int i = 0; i < 5800; i+=speed){
            System.out.println(i);
        }
    }

    public void setToerental(int toerental) {
        this.toerental = toerental;
    }

    public int getToerental() {
        return toerental;
    }




}
