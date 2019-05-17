package syntax;

import interpreter.ExpressionBuilder;
import lexer.TokenQueue;

public class CreatorCommandCycle extends AbstractCreatorCommand {

    @Override
    public ICommand createCommand(TokenQueue tokenQueue) {
        return new CommandCycle(ExpressionBuilder.build(tokenQueue));
    }
}
