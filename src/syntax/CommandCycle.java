package syntax;

import interpreter.Contex;
import interpreter.Expression;

public class CommandCycle implements ICommand {

    private Expression expression;
    private ICondition condition;

    public CommandCycle(Expression expression) {
        this.expression = expression;
        condition = new ZeroNotEqualCondition();
    }

    @Override
    public void exec(Contex contex) {
        while (condition.compute(contex))
            expression.run(contex);
    }
}
