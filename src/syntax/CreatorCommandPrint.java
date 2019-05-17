package syntax;

import lexer.TokenQueue;

public class CreatorCommandPrint extends AbstractCreatorCommand {

    @Override
    public ICommand createCommand(TokenQueue tokenQueue) {
        return new CommandPrint();
    }
}
