/*
Write a program to calculate the maximum element in the array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 65
Input 1: arr[] = {4,3,6,7,1}
Output 1: 7
*/
// time complexity : o(n)
// space complexity : O(1)

public class Section_1_Question_3 {

  public static void getMaxElement(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i : arr) {
      if (i > max) {
        max = i;
      }
    }
    System.out.println("Max element in the array is : " + max);
  }

  // driver code
  public static void main(String[] args) {
    // test case - 1
    int arr[] = { 34, 21, 54, 65, 43 };
    getMaxElement(arr);
    // test case - 2
    int arr2[] = { 4, 3, 6, 7, 1 };
    getMaxElement(arr2);
  }
}

/*
Output :
Max element in the array is : 65
Max element in the array is : 7
*/
