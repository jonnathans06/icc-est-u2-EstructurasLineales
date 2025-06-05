package ejercicio_01_sing;

import controller.StackG;

public class SingValidator {

    public boolean isValid(String input) {

        StackG<Character> pila = new StackG<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) return false;
                char tope = pila.pop();
                if (
                        (c == ')' && tope != '(') ||
                                (c == '}' && tope != '{') ||
                                (c == ']' && tope != '[')
                ) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return pila.isEmpty();
    }
}