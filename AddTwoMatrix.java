import java.util.Scanner;
class AddTwoMatrix {
    public static void main(String[] args) {
        int a[][]=new int [2][2];
        int b[][]=new int [2][2];
        int c[][]=new int [2][2];
        
        Scanner r=new Scanner(System.in);
        // Input first matrix
        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
       // Input second matrix
        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
       // Add matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
       // Print result
        System.out.println("Sum of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
