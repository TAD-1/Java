import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Midterm_Summative_2 {

    public static void main(String[] Args) {
        Menu();
    }

    public static void Menu() {

        System.out.println("\n\nMenu of Choices \n\n" +
                "A - Array Problem \n" +
                "B - Linked List Problem \n" +
                "C - Stack Problem \n" +
                "X - Exit \n");
        GoTo();

    }

    public static void GoTo() {

        System.out.print("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        System.out.print("\n");

        switch(choice) {
            case "a": case "A": Array_Problem(); break;
            case "b": case "B": Linked_List_Problem(); break;
            case "c": case "C": Stack_Problem(); break;
            case "x": case "X": System.out.print("Exiting"); System.exit(0); break;
            default: System.out.println("Wrong input."); GoTo(); break;
        }

    }

    public static void Array_Problem() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter array size: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        int x = 0;
        while(x < size) {
            System.out.print("Enter Array[" + x + "] : ");

            if(x > 0) {
                int input = scan.nextInt();
                boolean already_existed = false;

                int y = 0;
                while(y <= x && !already_existed) {
                    if(input == array[y]) {
                        already_existed = true;
                    }
                    y++;
                }

                if(!already_existed) {
                    array[x] = input;
                    x++;
                }
            }

            if(x == 0) {
                array[x] = scan.nextInt();
                x++;
            }
        }

        //Print Arrays
        for(int y = 0; y < size; y++) {
            System.out.print(array[y] + " ");
        }

        System.out.print("\nProcess Completed.");
        Menu();

    }

    public static void Linked_List_Problem() {

        System.out.print("input \"888\" to stop. \n");
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        boolean Entered_888 = false;

        while (!Entered_888) {
            System.out.print("Enter element: ");
            int input = scan.nextInt();

            if(input == 888) {
                Entered_888 = true;
                System.out.println("Linked List: " + list);
            }
            else {

                if(list.contains(input)) {
                    int position = list.indexOf(input);
                    list.add(position,input);
                    System.out.println(list);
                }
                else {
                    list.add(input);
                    System.out.println(list);
                }

            }

        }



        Menu();

    }

    public static void Stack_Problem() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String input = scan.next();
        Stack<Character>stack = new Stack<>();
        int length = input.length();
        int balance = 0;
        boolean started_with_close = false;

        for(int x = 0; x < length; x++) {

            stack.push(input.charAt(x));


            switch(stack.peek()) {
                case '(': balance = balance + 1; break;
                case ')': balance = balance - 1; break;
            }

            if(x == 0) {
                if (balance == -1) {
                    started_with_close = true;
                }
            }

        }

        if(balance == 0 && !started_with_close) {
            System.out.println("Balanced parenthesis.");
        }
        else if(started_with_close && balance == 0) {
            System.out.println("Unbalanced parenthesis. \nClosed a without opening a parenthesis first. ");
        }
        else {
            System.out.println("Unbalanced parenthesis.");
        }

        Menu();

    }

}
