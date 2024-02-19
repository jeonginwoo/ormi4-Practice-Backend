package WeeklyQuiz.Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> bracket = new Stack<>();

        String brackets = br.readLine();
        boolean isMatchingBracket = false;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                bracket.push(brackets.charAt(i));
            } else {
                if (bracket.isEmpty()) {
                    bracket.push(brackets.charAt(i));
                    break;
                } else {
                    bracket.pop();
                }
            }
            System.out.println(bracket);
        }

        if (bracket.isEmpty()) {
            isMatchingBracket = true;
        }

        System.out.println(isMatchingBracket);
    }
}
