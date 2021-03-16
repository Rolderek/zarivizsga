package kennel;

import org.w3c.dom.html.HTMLAppletElement;

public class Beagle extends Dog {

    public Beagle(String name) {
        super(name);
    }

    public Beagle(String name, int happiness) {
        super(name, happiness);
    }

    @Override
    public void feed() {
        happiness = (super.happiness + 2 );
    }

    @Override
    public void play(int hours) {
        happiness = (super.happiness + hours * 2);
    }
}


