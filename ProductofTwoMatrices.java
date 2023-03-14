import java.util.Scanner;

public class Timtiman_ProductofTwoMatrices {
    public static void main(String[] args){

        int [][] Array1 = new int[3][3];
        int [][] Array2 = new int[3][3];

        System.out.println("Give the values of the 1st array.");
        giveArray_Value(Array1);
        System.out.println("\n\nGive the values of the 2nd array.");
        giveArray_Value(Array2);

        System.out.println("\nArray 1:");
        displayArray(Array1);
        System.out.println("\nArray 2:");
        displayArray(Array2);

        ProductofMatrices(Array1,Array2);
        System.out.println("End");
    }

    public static void giveArray_Value(int [][] Array){
        Scanner scanner = new Scanner(System.in);

        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                System.out.print("Enter the value of array[" + row + "][" + column + "]:");
                if(scanner.hasNextInt()){
                    Array[row][column] = scanner.nextInt();
                }
                else{
                    System.out.println("Invalid Input! input must be an integer.");
                    scanner.reset();
                    scanner.next();
                    column--;
                }
            }
        }
    }

    public static void displayArray(int [][] Array){
        for(int row = 0; row < 3; row++){
            if(row > 0)
                System.out.print("\n");
            for(int column = 0; column < 3; column++){
                System.out.print("\t\t" + Array[row][column]);
            }
        }
        System.out.print("\n");
    }

    public static void ProductofMatrices(int [][] Array1, int [][] Array2){

        int [][] Product = new int[3][3];

        Product[0][0]=(Array1[0][0]*Array2[0][0])+(Array1[0][1]*Array2[1][0])+(Array1[0][2]*Array2[2][0]);
        Product[0][1]=(Array1[1][0]*Array2[0][0])+(Array1[1][1]*Array2[1][0])+(Array1[1][2]*Array2[2][0]);
        Product[0][2]=(Array1[2][0]*Array2[0][0])+(Array1[2][1]*Array2[1][0])+(Array1[2][2]*Array2[2][0]);

        Product[1][0]=(Array1[0][0]*Array2[0][1])+(Array1[0][1]*Array2[1][1])+(Array1[0][2]*Array2[2][1]);
        Product[1][1]=(Array1[1][0]*Array2[0][1])+(Array1[1][1]*Array2[1][1])+(Array1[1][2]*Array2[2][1]);
        Product[1][2]=(Array1[2][0]*Array2[0][1])+(Array1[2][1]*Array2[1][1])+(Array1[2][2]*Array2[2][1]);

        Product[2][0]=(Array1[0][0]*Array2[0][2])+(Array1[0][1]*Array2[1][2])+(Array1[0][2]*Array2[2][2]);
        Product[2][1]=(Array1[1][0]*Array2[0][2])+(Array1[1][1]*Array2[1][2])+(Array1[1][2]*Array2[2][2]);
        Product[2][2]=(Array1[2][0]*Array2[0][2])+(Array1[2][1]*Array2[1][2])+(Array1[2][2]*Array2[2][2]);

        System.out.println("\nProduct of Array1 and Array2: ");
        displayArray(Product);

    }
}
