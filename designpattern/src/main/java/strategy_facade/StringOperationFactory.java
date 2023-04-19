package strategy_facade;

import java.util.HashMap;
import java.util.Map;

public class StringOperationFactory {
    private Map<String, StringOperation> operationPool;

    public StringOperationFactory() {
        operationPool = new HashMap<String, StringOperation>();
    }

    public StringOperation getOperation(String operationType) {
        StringOperation operation = operationPool.get(operationType);

        if (operation == null) {
            switch (operationType) {
                case "UPPERCASE":
                    operation = new UpperCaseOperation();
                    break;
                case "LOWERCASE":
                    operation = new LowerCaseOperation();
                    break;
                case "REVERSE":
                    operation = new ReverseOperation();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation type: " + operationType);
            }
            operationPool.put(operationType, operation);
        }

        return operation;
    }
}
