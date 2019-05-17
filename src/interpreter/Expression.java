package interpreter;

import interpreter.Contex;
import syntax.ICommand;

import java.util.ArrayList;

public class Expression {

    private ArrayList<ICommand> commands = new ArrayList<>();

    public Expression(ArrayList<ICommand> commands) {
        this.commands = commands;
    }

    public Expression() {
    }


    public void run(Contex contex){
        for (ICommand command: commands)
            command.exec(contex);
    }

    public void addComand(ICommand command){
        commands.add((command));
    }

}
