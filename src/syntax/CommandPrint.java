package syntax;

import interpreter.Contex;

public class CommandPrint implements ICommand {

    @Override
    public void exec(Contex contex) {
        System.out.print((char)contex.getCurrent());
    }

}
