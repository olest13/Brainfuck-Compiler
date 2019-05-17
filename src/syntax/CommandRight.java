package syntax;

import interpreter.Contex;

public class CommandRight implements ICommand {

    @Override
    public void exec(Contex contex) {
        contex.rightPosition();
    }
}
