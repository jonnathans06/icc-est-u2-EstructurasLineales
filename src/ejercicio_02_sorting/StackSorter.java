package ejercicio_02_sorting;

import controller.StackG;

public class StackSorter {

    public void sortStack(StackG<Integer> stack) {

        StackG<Integer> stackAux = new StackG<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!stackAux.isEmpty() && stackAux.peek() > temp) {
                stack.push(stackAux.pop());
            }

            stackAux.push(temp);
        }

        while (!stackAux.isEmpty()) {
            stack.push(stackAux.pop());
        }
    }
}
