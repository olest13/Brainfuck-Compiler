package lexer;

import interpreter.Contex;
import interpreter.Expression;
import interpreter.ExpressionBuilder;

public class BrainfuckRunner {

    public void run(String code){
        Contex contex = new Contex();
        BrainfuckParser brainfuckParser = new BrainfuckParser();
        TokenQueue tokenQueue = brainfuckParser.parseBrainfuck(code);
        Expression mainExpression = ExpressionBuilder.build(tokenQueue);
        mainExpression.run(contex);
    }

}
