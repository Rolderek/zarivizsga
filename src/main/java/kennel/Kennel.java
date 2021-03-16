package kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> feedAll() {
        List<Dog> d = new ArrayList<>();
        for (Dog dogie: dogs) {
            dogie.feed();
            d.add(dogie);
        }
        dogs = d;
        return dogs;
    }

    public Dog findByName(String name) {
        Dog dog = null;
        for (Dog dogie: dogs) {
            if (dogie.getName().equals(name)) {
                dog = dogie;
            }
        }
        if (dog == null) {
            throw new IllegalArgumentException("Sajnos nem találtunk ilyen nevű kutyust.");
        }
        return dog;
    }

    public void playWith(String name, int hours) {
        for (Dog dogie: dogs) {
            if (dogie.getName().equals(name)) {
                dogie.play(hours);
            }
        }
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> result = new ArrayList<>();
        for (Dog dogie: dogs) {
            if (dogie.getHappiness() >= minHappiness) {
                result.add(dogie.getName());
            }
        }
        return result;
    }
}
