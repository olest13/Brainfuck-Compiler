public class CommandInc implements ICommand
{
    @Override
    public void exec(Contex contex) {
        contex.incCurrent();
    }
}
