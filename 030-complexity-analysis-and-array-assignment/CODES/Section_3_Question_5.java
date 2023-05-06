/*
Write a function which accepts a 2D array of integers and its size as arguments and
displays the elements of middle row and the elements of middle column. Printing can
be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
Input:
1 2 3 4 5
3 4 5 6 7
7 6 5 4 3
8 7 6 5 4
1 2 37 8 0
Output: 
3 5 5 6 37 7 6 4 3
*/

public class Section_3_Question_5 {

  public static void displayMiddleElements(int[][] arr, int size) {
    int middle = size / 2; // integer division to get the middle index
    // Display elements of middle row
    System.out.println("Middle row elements:");
    for (int j = 0; j < size; j++) {
      System.out.print(arr[middle][j] + " ");
    }

    System.out.println("");

    // Display elements of middle column
    System.out.println("Middle column elements:");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i][middle] + " ");
    }
  }

  //driver code
  public static void main(String[] args) {
    int[][] arr = {
      { 1, 2, 3, 4, 5 },
      { 3, 4, 5, 6, 7 },
      { 7, 6, 5, 4, 3 },
      { 7, 6, 5, 4, 3 },
      { 1, 2, 37, 8, 0 },
    };

    int size = arr.length;

    displayMiddleElements(arr, size);
  }
}
