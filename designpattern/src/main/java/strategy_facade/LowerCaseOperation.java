package strategy_facade;

public class LowerCaseOperation implements StringOperation {
    @Override
    public String execute(String input) {
        return input.toLowerCase();
    }
}
