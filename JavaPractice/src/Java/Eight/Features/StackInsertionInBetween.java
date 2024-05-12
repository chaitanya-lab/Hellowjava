package Java.Eight.Features;
import java.util.Stack;

public class StackInsertionInBetween {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Adding items to the stack
        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        stack.push("Item 4");
        stack.push("Item 5");
        stack.push("Item 6");
        
        System.out.println("Initial Stack: " + stack);

        // Inserting a new item in between (after 3rd element)
        Stack<String> tempStack = new Stack<>();
        int insertPosition = 3; // Index to insert the new item (0-based index)

        for (int i = 0; i < insertPosition; i++) {
            tempStack.push(stack.pop()); // Store elements until the insertion point
        }

        stack.push("New Item"); // Adding the new item to the stack

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop()); // Rebuild the stack with the remaining elements
        }

        System.out.println("Stack after adding in between: " + stack);
    }
}



