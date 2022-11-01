package testingCode;

public class robot extends tech{


    int batterylevel;
    int storageCapacity;
    boolean on;

    public robot(boolean operational, int storageCapacity){

        this.operational = operational;
        this.storageCapacity = storageCapacity;
    }

    public void on() {
        System.out.println("greetings, i hope your day is going well");
    }

    public int batterylevel() {
        return batterylevel;
    }

    public int chargeUp() {
        return 100;
    }
}
