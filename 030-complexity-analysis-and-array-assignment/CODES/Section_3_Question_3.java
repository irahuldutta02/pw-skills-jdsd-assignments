/*
Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
in any order.
Input : 
1 2 3
4 5 6
7 8 9
Output :
1 3 5 7 9
*/

import java.util.Scanner;

public class Section_3_Question_3 {

  public static void main(String args[]) {
    int m, n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    m = sc.nextInt();
    System.out.print("Enter the number of column : ");
    n = sc.nextInt();
    int arr[][] = new int[m][n];

    int i, j;

    System.out.println("Enter the  matrix element : ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.print("Elements on primary and secondary diagonals are : ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        if (i + j == m-1) {
          System.out.print(arr[i][j] + "  ");
        }
        if (i == j) {
          System.out.print(arr[i][j] + "  ");
        }
      }
    }
  }
}
/*
Output :
Enter the number of rows : 3
Enter the number of column : 3
Enter the  matrix element : 
1 2 3
4 5 6
7 8 9
Elements on primary and secondary diagonals are : 1 3 5 7 9
*/
