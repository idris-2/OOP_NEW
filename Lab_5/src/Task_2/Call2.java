package Task_2;

public class Call2 {
    public static void main(String[] args) {
        Book book1 = new Book("idk sum dude", "part 1", 0.5);
        Book book2 = new Book("sum other dude", "part 2", 0.5);
        Book book3 = new Book("sum third dude", "part 3", 0.5);

        CD cd1 = new CD("suica", "suica", 1949);
        CD cd2 = new CD("%#&$!*", "&!(*@^%(!))", 1939);
        CD cd3 = new CD("neki lik", "o nekom liku", 1919);

        Box box = new Box(10);
        System.out.println(box);

        Thing[] thingsToAdd = {book1, book2, book3, cd1, cd2, cd3};

        box.add(new Book("Knjiga", "Ef", 5));
        for (Thing thing : thingsToAdd) {
            box.add(thing);
        }

        System.out.println(box);
        System.out.println(book1.weight());
        System.out.println(cd1.weight());
    }
}
