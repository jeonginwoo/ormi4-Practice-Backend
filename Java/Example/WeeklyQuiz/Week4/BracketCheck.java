package WeeklyQuiz.Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BracketCheck {
    public static boolean isMatchingBracket(String brackets) {
        Stack<Character> bracket = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                bracket.push(brackets.charAt(i));
            } else {
                if (bracket.isEmpty()) {
                    bracket.push(brackets.charAt(i));
                    return false;
                } else {
                    bracket.pop();
                }
            }
        }

        if (bracket.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(isMatchingBracket(br.readLine()));
    }
}
