interface OperationInterface {
   int operation(int a, int b);
}
interface MessageInterface {
   String sayMessage(String message);
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        OperationInterface add = (int x, int y) -> x + y;
        OperationInterface multiply = (int x, int y) -> x * y;

        System.out.println("Addition is " + operate(6, 3, add));
        System.out.println("Multiplication is " + operate(6, 3, multiply));

}
    private static int operate(int a, int b, OperationInterface object) {
        return object.operation(a, b);
}
}
