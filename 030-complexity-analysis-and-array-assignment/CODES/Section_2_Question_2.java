/*------
Write a program to traverse over the elements of the array using for each loop and print all even elements.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 34 54
Input 1: arr[] = {4,3,6,7,1}
Output 1: 4 6
------*/
// time complexity : o(n)
// space complexity : O(1)

public class Section_2_Question_2 {

  public static void printEvenElement(int[] arr) {
    System.out.print("All even elements are : ");
    for (int i : arr) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  // diver code
  public static void main(String[] args) {
    // test case - 1
    int arr[] = { 34, 21, 54, 65, 43 };
    printEvenElement(arr);
    // test case - 2
    int arr2[] = { 4, 3, 6, 7, 1 };
    printEvenElement(arr2);
  }
}

/*
Output :
All even elements are : 34 54 
All even elements are : 4 6 
*/
