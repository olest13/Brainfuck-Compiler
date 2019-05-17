package syntax;

import lexer.TokenQueue;

public class CreatorCommandInc extends AbstractCreatorCommand {

    @Override
    public ICommand createCommand(TokenQueue tokenQueue) {
        return new CommandInc();
    }
}
