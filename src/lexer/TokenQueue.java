package lexer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TokenQueue {

    private ArrayDeque<Integer> tokens = new ArrayDeque<>();

    public int poll(){
        return tokens.poll();
    }

    public int peek(){
        return tokens.peek();
    }

    public int size(){
        return tokens.size();
    }

    public void add(int token){
        tokens.add(token);
    }


}
