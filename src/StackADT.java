import java.util.Stack;

public class StackADT {

    //pushing element on the top of the Stack
    public static void stackPush(Stack<Integer> stack){
        for (int i = 0; i <= 10; i++){
            stack.push(i);
        }
        System.out.println("Stack push : " + stack);
    }
    //popping element from the top of stack
    public static void stackPop(Stack<Integer> stack){
        int element = stack.pop();
        System.out.println("element pop : " + element);
        System.out.println("Stack pop : " + stack);
    }

    //Displaying element on the top of the stack
    public static void stackPeek(Stack<Integer> stack){
        int element = stack.peek();
        System.out.println("element on the top : " + element);
        System.out.println("Stack peek : " + stack);
    }

    //Search element in the stack
    public static void stackSearch(Stack<Integer> stack, int element){
        int findElement = stack.search(element);
        if(findElement == -1){
            System.out.println(element + " can not find in the stack");
        } else {
            System.out.println(element + " is found at position " + findElement);
        }
    }

    public static void checkEmptyStack(Stack<Integer> stack){
        boolean result = stack.empty();
        if(result){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

}
