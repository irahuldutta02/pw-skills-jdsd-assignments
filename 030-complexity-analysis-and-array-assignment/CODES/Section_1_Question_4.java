/*
Write a program to find out the second largest element in a given array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 54
Input 1: arr[] = {4,3,6,7,1}
Output 1: 6
*/
// time complexity : o(n)
// space complexity : O(1)

public class Section_1_Question_4 {

  public static void getSecondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }
    System.out.println("Second largest element in the arrayis : " + secondLargest);
  }

  // driver code
  public static void main(String[] args) {
    // test case - 1
    int[] arr1 = { 34, 21, 54, 65, 43 };
    getSecondLargest(arr1);

    // test case - 2
    int[] arr2 = { 4, 3, 6, 7, 1 };
    getSecondLargest(arr2);
  }
}

/*
Output :
Second largest element in the arrayis : 54
Second largest element in the arrayis : 6
*/
