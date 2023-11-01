package people;

public class Person {
    private String name;
    private String address;
    private int age;
    private String country;

    public Person(String name, int age, String country, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.country = country;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int new_age){
        this.age = new_age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String new_country){
        this.country = new_country;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address;
    }
}
