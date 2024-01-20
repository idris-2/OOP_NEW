package Task_3;
import java.util.Collection;
import Task_2.Thing;
/*
Together with the exercise body, you find the classes Thing and Box. The class Box is abstract, and it is programmed so that adding things 
always implies calling the method add. The add method, responsible for adding one thing, is abstract, and any box which inherits the class 
Box has to implement the method add. Your task is modifying the class Thing and implementing various different boxes based on Box.
Add all new classes to the package boxes.

a) Add an inspection to the constructor of Thing, to make sure that the thing's weight is never negative (weight 0 is accepted). If the weight
is negative, the constructor has to throw an IllegalArgumentException. Also implement the method equals in the class Thing, allowing you to 
use the contains method of different lists and collections. Implement the method without taking into consideration the value of the object 
variable weight.
b) Implement the class MaxWeightBox in the package boxes; the class inherits Box. MaxWeightBox has the constructor public 
MaxWeightBox(int maxWeight), which determines the box's maximum weight. Things can be added to MaxWeightBox if and only if the thing 
weight does not exceed the box weight.

c) Next, implement the class OneThingBox in the package boxes; the class inherits Box. OneThingBox has the constructor public OneThingBox(), 
and only one thing can fit there. If the box already contains one thing, this should not be changed. The weight of the added thing is not 
important.

d) Next, implement the class BlackHoleBox in the package boxes; the class inherits Box. BlackHoleBox has the constructor public 
BlackHoleBox(); anything can be added to a black-hole box, but none will be found when you look for them. In other words, adding things 
must always work, but the method isInTheBox has to always return false.

e) To enhance the flexibility and utility of the provided classes, you are required to implement upcasting and downcasting techniques. 
Implement upcasting by creating objects of classes Thing, MaxWeightBox, OneThingBox, and BlackHoleBox, and assign them to variables of 
type Box. Implement downcasting cautiously using the instanceof operator to check the compatibility of objects before performing the cast. 
Downcasting Box to MaxWeightBox, Thing, OneThingBox and BlackHoleBox.
*/

public abstract class Box {
    public abstract void add(Thing thing);

    public void add(Collection<Thing> things) {
        for (Thing thing : things) {
            add(thing);
        }
    }

    public abstract boolean isInTheBox(Thing thing);
}
