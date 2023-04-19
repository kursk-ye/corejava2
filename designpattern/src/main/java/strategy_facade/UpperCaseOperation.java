package strategy_facade;

public class UpperCaseOperation implements StringOperation {
    @Override
    public String execute(String input) {
        return input.toUpperCase();
    }
}
