package quiz3;

// The general Toy class with a sound parameter
class Toy {
    private String sound;

    public Toy(String sound) {
        this.sound = sound;
    }

    public void play() {
        System.out.println("Playing with the toy! Sound: " + sound);
    }

    public String getSound() {
        return sound;
    }
}

// The Car class, a special type of Toy with an additional parameter
class Car extends Toy {
    private String motorSound;

    public Car(String sound, String motorSound) {
        super(sound);
        this.motorSound = motorSound;
    }

    public void drive() {
        System.out.println("Vroom! Driving the car! Motor sound: " + motorSound);
    }

    public String getMotorSound() {
        return motorSound;
    }
}

// The Scooter class, another special type of Toy with an additional parameter
class Scooter extends Toy {
    private String hornSound;

    public Scooter(String sound, String hornSound) {
        super(sound);
        this.hornSound = hornSound;
    }

    public void ride() {
        System.out.println("Zoom! Riding the scooter! Horn sound: " + hornSound);
    }

    public String getHornSound() {
        return hornSound;
    }
}

public class Downcast {
    public static void main(String[] args) {
        // Create a general toy with a general sound
        Toy generalToy = new Car("Bing Bing", "vroom");

        // Play with the general toy
        generalToy.play();

        System.out.println();
        if(generalToy instanceof Car){
            Car new_lol = (Car) generalToy;
            new_lol.drive();
            new_lol.play();
        }
    }
}

