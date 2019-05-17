package test;

import interpreter.Contex;
import interpreter.Expression;
import interpreter.ExpressionBuilder;
import lexer.BrainfuckParser;
import lexer.SyntaxException;
import lexer.TokenQueue;

public class BrainfuckRunner {

    public void run(String code) throws SyntaxException {
        Contex contex = new Contex();
        BrainfuckParser brainfuckParser = new BrainfuckParser();
        TokenQueue tokenQueue = null;
            tokenQueue = brainfuckParser.parseBrainfuck(code);
        Expression mainExpression = ExpressionBuilder.build(tokenQueue);
        mainExpression.run(contex);
    }

}
