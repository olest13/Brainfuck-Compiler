package syntax;

import lexer.TokenQueue;

public class CreatorCommandDec extends AbstractCreatorCommand {

    @Override
    public ICommand createCommand(TokenQueue tokenQueue) {
        return new CommandDec();
    }
}
