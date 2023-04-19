package strategy_facade;

public class Client {
    public static void main(String[] args) {
        StringOperationFactory factory = new StringOperationFactory();

        StringOperation upperCaseOperation = factory.getOperation("UPPERCASE");
        StringOperation lowerCaseOperation = factory.getOperation("LOWERCASE");
        StringOperation reverseOperation = factory.getOperation("REVERSE");

        System.out.println(upperCaseOperation.execute("Hello, Strategy and Flyweight!"));
        System.out.println(lowerCaseOperation.execute("Hello, Strategy and Flyweight!"));
        System.out.println(reverseOperation.execute("Hello, Strategy and Flyweight!"));
    }
}

