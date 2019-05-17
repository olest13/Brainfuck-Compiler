public class CommandDec implements ICommand {

    @Override
    public void exec(Contex contex) {
        contex.decCurrent();
    }

}
