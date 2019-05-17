package test;
import lexer.BrainfuckRunner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        BrainfuckRunner brainfuckRunner = new BrainfuckRunner();
        brainfuckRunner.run(input);

        sc.close();
    }


}
