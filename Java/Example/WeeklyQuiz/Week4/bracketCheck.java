package WeeklyQuiz.Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class bracketCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> bracket = new Stack<>();

        String brackets = br.readLine();

        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                bracket.push(brackets.charAt(i));
            } else {
                bracket.pop();
            }
            System.out.println(bracket);
        }

        boolean isMatchingBracket;
        if (bracket.isEmpty()) {
            isMatchingBracket = true;
        } else {
            isMatchingBracket = false;
        }

        System.out.println(isMatchingBracket);
    }
}
