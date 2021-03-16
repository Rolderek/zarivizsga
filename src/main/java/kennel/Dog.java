package kennel;

public abstract class Dog {

    protected String name;
    protected int happiness = 0;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void feed() {
    }

    public void play(int hours) {
    }
}