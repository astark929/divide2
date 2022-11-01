package testingCode;

public class ameca extends robot{

    int steps;


    public ameca(int storageCapacity, int steps, boolean operational, int batterylevel, boolean on){

        super(operational, storageCapacity);
        this.steps = steps;
        this.batterylevel = batterylevel;
        this.on = on;


    }

}
