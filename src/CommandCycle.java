public class CommandCycle implements ICommand {

    private Expression expression;
    private ICondition condition;

    public CommandCycle(Expression expression) {
        this.expression = expression;
        condition = new ZeroEqualCondition();
    }

    @Override
    public void exec(Contex contex) {
        while (condition.compute(contex))
            expression.run();
    }
}
