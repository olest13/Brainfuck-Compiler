package syntax;

import interpreter.Contex;
import lexer.TokenQueue;
import syntax.ICommand;

public abstract class AbstractCreatorCommand {

    public abstract ICommand createCommand(TokenQueue tokenQueue);

}
