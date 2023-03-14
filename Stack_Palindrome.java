import java.util.Scanner;
import java.util.Stack;

public class Timtiman_Stack_Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        
        String input = scan.next();
        
        int length = input.length() - 1;
        
        Stack<Character> stack = new Stack<>();
        Stack<Character> other_stack = new Stack<>();

        //Insert to stack
        for (int x = 0; x <= length; x++) {
            stack.add(input.charAt(x));
        }
        System.out.println(stack);

        //Insert to other_stack in reverse
        for (int x = length; x >= 0; x--) {
            other_stack.add(input.charAt(x));
        }
        System.out.println(other_stack);

        boolean is_palindrome = palindrome_check(stack, other_stack);

        if (is_palindrome)
            System.out.println("The input is a palindrome");
        else
            System.out.println("The input is not a palindrome");
    }

    public static boolean palindrome_check(Stack<Character> stack, Stack<Character> other_stack) {

        boolean is_palindrome = true;

        while (!stack.empty() && !other_stack.empty()) {

            if (Character.toLowerCase(stack.pop()) != Character.toLowerCase(other_stack.pop()))
                is_palindrome = false;

        }

        return is_palindrome;
    }

}
