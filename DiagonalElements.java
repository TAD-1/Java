import java.util.*;
import java.lang.*;

public class Timtiman_DiagonalElements{
    public static void main (String args []){

        Scanner sc = new Scanner(System.in);

        int i, j, Diagonal2nd = 0, Diagonal1st = 0, input;

    try{
        System.out.print("Enter array size: ");

        input = sc.nextInt();

        if( input > 0 ){

        System.out.println("\nEnter " + input * input + " Elements:");

        int[][] mat = new int[input][input];

        for(i=0; i<input; i++)
        {
            for(j=0; j < input; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe elements of the matrix\n") ;
        for( int [] a : mat)
        {
            for(int b : a)
            {
                System.out.print(b + "    ");
            }
            System.out.println();
        }

        for ( i = 0; i < input; i++) {
            Diagonal1st += mat[i][i];
        }

        int c = 0;
        for ( j = input - 1; j >= 0; j--) {
            Diagonal2nd += mat[c][j];
            c++;
        }
        System.out.println("\nSum of first diagonal elements = " + Diagonal1st);

        System.out.println("\nSum of Second diagonal elements = " + Diagonal2nd);
        System.exit(0);
    }

            else System.out.println("\nInvalid input - Positive Integer only.\n");
            main(args);
}

        catch (InputMismatchException e)
                {
                System.out.println("\nInvalid input - Please enter Positive integers only.\n");
                main(args);
                }
    }
}