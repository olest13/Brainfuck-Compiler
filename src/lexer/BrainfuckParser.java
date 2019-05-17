package lexer;

public class BrainfuckParser {

    public TokenQueue parseBrainfuck(String code) throws SyntaxException {
        TokenQueue tokenQueue = new TokenQueue();
        char[] commands = code.toCharArray();

        int bracketsNesting = 0;

        for (char c: commands) {
            switch (c){
                case '+':
                    tokenQueue.add(TokenConst.INCREMENT);
                    break;
                case '-':
                    tokenQueue.add(TokenConst.DECREMENT);
                    break;
                case '<':
                    tokenQueue.add(TokenConst.MOVE_LEFT);
                    break;
                case '>':
                    tokenQueue.add(TokenConst.MOVE_RIGHT);
                    break;
                case '[':
                    tokenQueue.add(TokenConst.LEFT_BRACKET);
                    bracketsNesting++;
                    break;
                case ']':
                    tokenQueue.add(TokenConst.RIGHT_BRACKET);
                    bracketsNesting--;
                    break;
                case '.':
                    tokenQueue.add(TokenConst.PRINT);
                    break;
                default:
                    throw new SyntaxException("Incorrect symbol");
            }
            if (bracketsNesting < 0)
                throw new SyntaxException("Wrong closing brackets");
        }

        if (bracketsNesting > 0)
            throw new SyntaxException("Not all brackets are closed");


        return tokenQueue;
    }

}
