package ejercicio_01_sing;

public class SingValidator {

    public boolean isValid(String input) {

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            if (c != '(' && c != ')' && c != '{' && c != '}' && c != '[' && c != ']') {
                return false;
            }

            if (c == '(' || c == '{' || c == '[') {
                if (i + 1 < input.length()) {
                    char nextChar = input.charAt(i + 1);
                    if ((c == '(' && nextChar != ')') ||
                        (c == '{' && nextChar != '}') ||
                        (c == '[' && nextChar != ']')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }

        }
        return false;
    }

}