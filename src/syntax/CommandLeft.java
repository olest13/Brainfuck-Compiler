package syntax;

import interpreter.Contex;

public class CommandLeft implements ICommand {

    @Override
    public void exec(Contex contex) {
        contex.leftPosition();
    }
}
