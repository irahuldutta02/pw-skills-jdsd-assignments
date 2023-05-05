/*
Q1: Take m and n input from the user and m • n integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of O.
Input :
1 2 -3 4
0 0 -4 2
1 -1 2 3
-4 -5 -7 0
Output :
Positive : 7
Negetive : 6
Odd : 7
Even : 9
Zero : 3
*/

import java.util.Arrays;
import java.util.Scanner;

public class Section_3_Question_1 {

  public static void operations(int arr[][]) {
    int m = arr.length;
    int n = arr[0].length;

    int positive = 0, negative = 0, odd = 0, even = 0, zero = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] > 0) {
          positive += 1;
        }
        if (arr[i][j] < 0) {
          negative += 1;
        }

        if (arr[i][j] % 2 != 0) {
          odd += 1;
        }
        if (arr[i][j] % 2 == 0) {
          even += 1;
        }

        if (arr[i][j] == 0) {
          zero += 1;
        }
      }
    }

    System.out.println("Positive : " + positive);
    System.out.println("Negetive : " + negative);
    System.out.println("Odd : " + odd);
    System.out.println("Even : " + even);
    System.out.println("Zero : " + zero);
  }

  public static void main(String[] args) {
    // taking 2d array input
    Scanner sc = new Scanner(System.in);
    System.out.print("No of row : ");
    int r = sc.nextInt();
    System.out.print("No of coloum : ");
    int c = sc.nextInt();
    int[][] arr = new int[r][c];
    System.out.println("Input " + (r * c) + " no of elements : ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("Original Array : ");
    for (var mat : arr) {
      System.out.println(Arrays.toString(mat));
    }
    System.out.println("----------------------------");

    operations(arr);
    sc.close();
  }
}
/*
Output :
No of row : 4
No of coloum : 4
Input 16 no of elements : 
1 2 -3 4
0 0 -4 2
1 -1 2 3
-4 -5 -7 0
Original Array : 
[1, 2, -3, 4]
[0, 0, -4, 2]
[1, -1, 2, 3]
[-4, -5, -7, 0]
----------------------------
Positive : 7
Negetive : 6
Odd : 7
Even : 9
Zero : 3
*/
