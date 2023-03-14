import java.util.Scanner;
import java.util.Stack;

public class Stack_Operations {

    public static void main(String[] args) {

        System.out.print("Size of stack: ");
        int size = Input(); //Size declaration

        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter " + size + " elements");
        int i = 0 ;
        while (i < size) { //Inputting Element
            stack.push(Input());
            System.out.println("Top of the stack: " + stack.peek()); //Display Top
            i++;
        }

        System.out.println("\n" + stack);

        System.out.println("Enter the element to be searched.");
        int find = Input();
        int position  = Position_search(find,stack,size);

        if(position == 0)
            System.out.println("Element is not in the stack.");
        else
            System.out.println("index of " + find + " is: " + position);

        System.out.println("[END]");
    }

    public static Integer Input() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static int Position_search(int find, Stack<Integer> stack, int size ) {

        int position = 0;
        boolean found = false;

        int i = 1;
        while(i <= size && !found) {

            found = find == stack.pop();

            if(found) {
                position = i;
            }

            i++;
        }

        return position;
    }

}
