package strategy_facade;

public class ReverseOperation implements StringOperation {
    @Override
    public String execute(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
