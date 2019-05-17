import java.util.ArrayList;

public class Expression {

    private Contex contex;
    private ArrayList<ICommand> commands;

    public Expression(ArrayList<ICommand> commands) {
        this.commands = commands;
    }

    public Expression(Contex contex, ArrayList<ICommand> commands) {
        this.contex = contex;
        this.commands = commands;
    }

    public void run(){
        for (ICommand command: commands)
            command.exec(contex);
    }

}
