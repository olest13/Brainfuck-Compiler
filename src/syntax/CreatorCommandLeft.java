package syntax;

import lexer.TokenQueue;

public class CreatorCommandLeft extends AbstractCreatorCommand{

    @Override
    public ICommand createCommand(TokenQueue tokenQueue) {
        return new CommandLeft();
    }
}
