import controller.StackG;
import ejercicio_01_sing.SingValidator;
import ejercicio_02_sorting.StackSorter;

public class AppEjercicios {
    public static void main(String[] args) {
        SingValidator validator = new SingValidator();
        System.out.println("{[()]} -> " + validator.isValid("{[()]}"));
        System.out.println("{[(]} -> " + validator.isValid("{[(]}"));

        StackG<Integer> stack = new StackG<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        StackSorter sorter = new StackSorter();

        System.out.println("Pila original: ");
        stack.printStack();

        sorter.sortStack(stack);
        System.out.println("Pila ordenada: ");
        stack.printStack();
    }
}