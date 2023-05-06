/*
Write a program to find the largest element of a given 2D array of integers.
Input :
1 2 4 0
2 5 7 -1
4 2 6 9
Output :
9
*/
import java.util.Scanner;

public class Section_3_Question_4 {

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

    int max = Integer.MIN_VALUE;
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
    }

    System.out.print("Max Element : " + max);
  }
}
/*
Output :
Enter the number of rows : 3
Enter the number of column : 3
Enter the  matrix element : 
1 2 4 0
2 5 7 -1
4 2 6 9
Max Element : 9
*/
