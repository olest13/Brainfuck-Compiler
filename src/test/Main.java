package test;
import lexer.SyntaxException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        BrainfuckRunner brainfuckRunner = new BrainfuckRunner();

        try {
            brainfuckRunner.run(input);
        }catch (SyntaxException syntaxException){
            System.out.println(syntaxException.getMessage());
        }

        sc.close();
    }


}
