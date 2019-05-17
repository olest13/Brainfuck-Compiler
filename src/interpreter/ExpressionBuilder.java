package interpreter;

import lexer.*;
import syntax.*;

public class ExpressionBuilder {

    public static Expression build(TokenQueue tokenQueue){
        Expression result = new Expression();

        AbstractCreatorCommand currentCreator = null;

        while (tokenQueue.size() > 0){
            int token = tokenQueue.poll();
            switch (token){
                case TokenConst.INCREMENT:
                    currentCreator = new CreatorCommandInc();
                    break;
                case TokenConst.DECREMENT:
                    currentCreator = new CreatorCommandDec();
                    break;
                case TokenConst.MOVE_LEFT:
                    currentCreator = new CreatorCommandLeft();
                    break;
                case TokenConst.MOVE_RIGHT:
                    currentCreator = new CreatorCommandRight();
                    break;
                case TokenConst.PRINT:
                    currentCreator = new CreatorCommandPrint();
                    break;
                case TokenConst.LEFT_BRACKET:
                    currentCreator = new CreatorCommandCycle();
                    break;
                case TokenConst.RIGHT_BRACKET:
                    return result;
            }
            try {
                result.addComand(currentCreator.createCommand(tokenQueue));
            }
            catch (NullPointerException ex){

            }
        }

        return result;
    }

}
