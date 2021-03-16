package kennel;


public class Husky extends Dog {

    public Husky(String name) {
        super(name);
    }

    public Husky(String name, int happiness) {
        super(name, happiness);
    }

    @Override
    public void feed() {
        happiness = (super.happiness + 4 );
    }

    @Override
    public void play(int hours) {
        happiness = (super.happiness + hours * 3 );
    }
}


