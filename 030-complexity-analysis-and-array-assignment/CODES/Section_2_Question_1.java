/*-----
Write a program to print the sum of all the elements present on even indices in the given array.
Input 1: arr[] = {3,20,4,6,9}
Output 1: 16
Input 1: arr[] = {4,3,6,7,1}
Output 1: 11
------*/

// time complexity : O(n)
// space complexity : O(1)

public class Section_2_Question_1 {

  public static void evenIndexSumOfArray(int[] arr) {
    int n = arr.length;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        sum += arr[i];
      } else {
        continue;
      }
    }

    System.out.println("Sum of all the elements on even indices is : " + sum);
  }

  // driver code
  public static void main(String[] args) {
    // testcase - 1
    int[] arr = { 3, 20, 4, 6, 9 };
    evenIndexSumOfArray(arr);

    // testcase - 2
    int[] arr2 = { 4, 3, 6, 7, 1 };
    evenIndexSumOfArray(arr2);
  }
}

/*
Output :
Sum of all the elements on even indices is : 16
Sum of all the elements on even indices is : 11
*/

