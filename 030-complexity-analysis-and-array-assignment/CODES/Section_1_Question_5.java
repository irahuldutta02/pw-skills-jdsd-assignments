/*
Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor.
Input 1: arr[] = {1,3,2,6,5}
Output 1: 3
Input 2: arr[] = {14,7,3,2,6,5}
Output 1: 6
*/
// time complexity : o(n)
// space complexity : O(1)

public class Section_1_Question_5 {

  public static void findPeakElement(int[] arr) {
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
        System.out.println(arr[i] + " is a peak element in the array.");
        return;
      }
    }
    System.out.println("There is no peak element in the array.");
  }

  // driver code
  public static void main(String[] args) {
    // test case - 1
    int[] arr = { 1, 3, 2, 6, 5 };
    findPeakElement(arr);
    // test case - 2
    int[] arr2 = { 14, 7, 3, 2, 6, 5 };
    findPeakElement(arr2);
  }
}

/*
Output :
3 is a peak element in the array.
6 is a peak element in the array.
*/
