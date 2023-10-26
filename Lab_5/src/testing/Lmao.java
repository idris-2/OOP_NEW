package testing;

public class Lmao {
    private String name;
    private String address;

    public Lmao(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address;
    }
}