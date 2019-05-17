package syntax;

import lexer.TokenQueue;

public class CreatorCommandRight extends AbstractCreatorCommand {

    @Override
    public ICommand createCommand(TokenQueue tokenQueue) {
        return new CommandRight();
    }
}
