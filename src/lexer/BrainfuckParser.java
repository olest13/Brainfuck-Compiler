package lexer;

public class BrainfuckParser {

    public TokenQueue parseBrainfuck(String code){
        TokenQueue tokenQueue = new TokenQueue();
        char[] commands = code.toCharArray();

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
                    break;
                case ']':
                    tokenQueue.add(TokenConst.RIGHT_BRACKET);
                    break;
                case '.':
                    tokenQueue.add(TokenConst.PRINT);
                    break;
            }
        }

        return tokenQueue;
    }

}
