package Task_2;

import java.util.ArrayList;

public class Box {
    private double maxWeight;
    private ArrayList<Thing> things = new ArrayList<>();
    private double currentWeight;
    //private int thingCount; NE TREBA NAM KAD IMAMO things.size()

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        //this.thingCount = 0;
    }

    public void add(Thing thing) {
        if(thing.getWeight() > this.maxWeight - this.currentWeight) {
            System.out.println("Too much weight");
        } else {
            currentWeight += thing.getWeight();
            //thingCount++;
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight: " + this.currentWeight;
    }
}