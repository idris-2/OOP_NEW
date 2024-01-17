package quiz3;

/*
create and interface called Drivable that has one abstract method called drive that return String.

Create class called Car that has one property called motorSound of type String this class should implement the interface 
Drivable and method drive, so it returns the value of the motorSound property for the Car class instance and concatenate 
the string " is the sound". provide the constructor that gets and sets the value of that property and implement the get 
and set methods for that property.

Create class called Scooter that has one property called sound of type String. this class should implement the interface 
Drivable and method drive, so it returns the value of sound property for Scooter class instance and concatenates the string 
" is the sound". provide the constructor that gets and sets the value of that property and implement the get and set methods 
for that property.
 */
interface Drivable{
    public String drive();
}

class Car implements Drivable{
    private String motorSound;

    public Car(String motorSound) {
        this.motorSound = motorSound;
    }
    public String getMotorSound() {
        return motorSound;
    }
    public void setMotorSound(String motorSound) {
        this.motorSound = motorSound;
    }

    @Override
    public String drive(){
        return motorSound + " is the sound.";
    }
}

class Scooter implements Drivable {
    private String sound;

    // Constructor
    public Scooter(String sound) {
        this.sound = sound;
    }
    // Getter and setter for sound property
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    // Implementing drive method from the Drivable interface
    @Override
    public String drive() {
        return sound + " is the sound";
    }
}

public class quiz3 {
    public static void main(String[] args) {
        Car myCar = new Car("Vroom");
        System.out.println(myCar.drive());  // Outputs: Vroom is the sound

        Scooter myScooter = new Scooter("Beep");
        System.out.println(myScooter.drive());
    }
}
