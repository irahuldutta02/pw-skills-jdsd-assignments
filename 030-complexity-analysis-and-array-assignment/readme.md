### Profile Links : [rahuldutta.bio.link](https://rahuldutta.bio.link)
---
## **1. Time and space complexity**
---

**Question 1 :** 
-
### Analyze the time complexity of the following Java code and suggest a way to improve it:

```java
int sum = 0;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        sum++;
    }
}
```
__Answer :__

The time complexity of this code is O(n^2) as it uses nested loops, where the outer loop runs n times and the inner
loop runs i times where i varies from 1 to n.
The total number of operations performed can be calculated by summing the total number of operations in each
iteration of the outer loop. The inner loop will run i times on the i-th iteration of the outer loop. So the number of
operations is (1+2+3+...+n) which is n(n+1)/2, which is O(n^2).
One way to improve the time complexity of this code is to use a mathematical formula to find the sum instead of
using nested loops.

**Question 2 :**
-
### Find the value of `T(2)` for the recurrence relation `T(n) = 3T(n-1) + 12n` given that `T(0) = 5`

__Answer :__

given T(n) = 3T(n-1) + 12n

Substituting the values in the relation:

T(1) = 3T(0) + 12

=> T(1) = 15 + 12 = 27

T(2) = 3T(1) + 12 * 2

=>T(2) = 3 * 27 + 24 = 81 + 24

Hence T(2) = 105.


**Question 3 :** 
-
### Given a recurrence relation, solve it using a substitution method. Relation : `T(n) = T(n - 1) + c`

__Answer :__

Let the solution be T(n) = O(n), now let’s prove this using the induction method.
For that to happen T(n) <= cn where c is some constant.
T(n) = T(n - 1) + c
T(n - 1) = T(n - 2) + c
T(n - 2) = T(n - 3) + c
|
|
T(2) = T(1) + c
—------------------------ Adding all above equations
T(n) = T(1) + cn
Let us assume T(1) to be a constant value.
T(n) = k + cn
Therefore, T(n) <= cn
Hence we can conclude T(n) = O(n).

**Question 4 :**
-
### Given a recurrence relation: `T(n) = 16T(n/4) + n2logn` | Find the time complexity of this relation using the master theorem.

__Answer :__

From the given recurrence relation we can obtain the value of different parameters such as a, b, p, and k.

Therelation: T(n)=16T(n/4)+n2logn

Here,a=16

b=4

k=2

p=1

bk=42=16

Herea=bk

Alsop>-1

Hence, T(n)=θ(nlogab*logp+1n)

Therefore, T(n)=θ(nlog164*log1+1n)=θ(n1/2log2n)

**Question 5 :**
-
### Solve the following recurrence relation using recursion tree method `T(n) = 2T(n/2) + n`

__Answer :__

To solve the recurrence relation T(n) = 2T(n/2) + n using the recursion tree method, we first draw a tree that represents the recursive calls made by the recurrence relation.

```
        T(n)
        / \
    T(n/2) T(n/2)
        /     \
    T(n/4)    T(n/4)
    /         \
    T(n/8)       T(n/8)
    /  \         /  \
T(n/16) T(n/16) T(n/16) T(n/16)
...   ...     ...     ...
```

At each level of the tree, we have two subproblems of size n/2, and the cost of each level is n. The tree has log n levels because the subproblem size reduces by half at each level until it reaches 1. 

The total cost of the recurrence relation is the sum of the costs at each level of the tree. At the bottom level, we have n/2^log n subproblems of size 1, each of which takes constant time to solve. Therefore, the cost at the bottom level is n/2^log n. At the level above the bottom level, we have 2(n/2) = n subproblems of size 2, each of which takes constant time to solve. Therefore, the cost at this level is 2(n/2) = n. Similarly, the cost at the level above that is 4(n/4) = n, and so on. The total cost of the recurrence relation is:

n/2^log n + n/2^(log n - 1) + n/2^(log n - 2) + ... + n/2^2 + n/2^1 + n/2^0

= n(1/2^log n + 1/2^(log n - 1) + 1/2^(log n - 2) + ... + 1/2^2 + 1/2^1 + 1/2^0)

= n(1 + 1/2 + 1/4 + ... + 1/2^(log n - 1) + 1/2^log n)

= n(2 - 1/2^log n)

= 2n - n/2^log n

Therefore, the solution to the recurrence relation T(n) = 2T(n/2) + n using the recursion tree method is T(n) = Θ(nlogn).

**Question 6 :**
-
### `T(n) = 2T(n/2) + K` | Solve using Recurrence tree method.

__Answer :__


To solve the recurrence relation T(n) = 2T(n/2) + K using the recursion tree method, we first draw a tree that represents the recursive calls made by the recurrence relation.

```
        T(n)
        / \
    T(n/2) T(n/2)
        /     \
    T(n/4)    T(n/4)
    /         \
    T(n/8)       T(n/8)
    /  \         /  \
T(n/16) T(n/16) T(n/16) T(n/16)
...   ...     ...     ...
```

At each level of the tree, we have two subproblems of size n/2, and the cost of each level is K. The tree has log n levels because the subproblem size reduces by half at each level until it reaches 1. 

The total cost of the recurrence relation is the sum of the costs at each level of the tree. At the bottom level, we have n/2^log n subproblems of size 1, each of which takes constant time K to solve. Therefore, the cost at the bottom level is n/2^log n * K = K. At the level above the bottom level, we have 2(n/2) = n subproblems of size 2, each of which takes constant time K to solve. Therefore, the cost at this level is 2(n/2) * K = nK. Similarly, the cost at the level above that is 4(n/4) = n, and so on. The total cost of the recurrence relation is:

K + nK + n/2 K + n/4 K + ... + 1/2 K + 1 K

This is a geometric series with a = K and r = 2, and the number of terms is log n + 1. Therefore, the sum is:

(K * (1 - 2^(log n + 1))) / (1 - 2)

= K * (1 - 2n/2^n) / (1 - 2)

= K * (2^n - n) / (2^(n-1))

Therefore, the solution to the recurrence relation T(n) = 2T(n/2) + K using the recursion tree method is T(n) = Θ(n + K * log n).

## **2. 1D Array**
---
**Q1:**
-
### Write a program to print the sum of all the elements present on even indices in the given array.

    Input 1: arr[] = {3,20,4,6,9}
    Output 1: 16
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 11

__Answer :__

```java
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

```

**Q2:**
-
### Write a program to traverse over the elements of the array using for each loop and print all even elements.

    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 34 54
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 4 6

__Answer :__

```java
/*-----
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
```

**Q3:**
- 
### Write a program to calculate the maximum element in the array.

    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 65
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 7

__Answer :__

```java
/*
Write a program to calculate the maximum element in the array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 65
Input 1: arr[] = {4,3,6,7,1}
Output 1: 7
*/
// time complexity : o(n)
// space complexity : O(1)

public class Section_2_Question_3 {

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

```

**Q4:** 
-
### Write a program to find out the second largest element in a given array.

    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 54
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 6

__Answer :__

```java
/*
Write a program to find out the second largest element in a given array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 54
Input 1: arr[] = {4,3,6,7,1}
Output 1: 6
*/
// time complexity : o(n)
// space complexity : O(1)

public class Section_2_Question_4 {

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

```

**Q5:** 
-
### Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor.

    Input 1: arr[] = {1,3,2,6,5}
    Output 1: 3
    Input 2: arr[] = {14,7,3,2,6,5}
    Output 1: 6

__Answer :__

```java
/*
Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor.
Input 1: arr[] = {1,3,2,6,5}
Output 1: 3
Input 2: arr[] = {14,7,3,2,6,5}
Output 1: 6
*/
// time complexity : o(n)
// space complexity : O(1)

public class Section_2_Question_5 {

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

```

## **3. 2D Array**
---

<!-- question-1 -->
<img src="https://user-images.githubusercontent.com/78687135/236384987-9edb6f39-50f0-461d-86cf-ab88cf023f50.png" alt="question-1" width="90%">

__Answer :__
```java
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

```


<!-- question-2 -->
<img src="https://user-images.githubusercontent.com/78687135/236385049-a3fb38a4-d59a-423b-8bf7-d1f1f350901d.png" alt="question-2" width="90%">

__Answer :__

```java
/*
Q2: write a program to print the elements above the secondary diagonal in a user inputted
square matrix.
Input : 
1 2 3
4 5 6
7 8 9
Output :
1 2 4
*/

import java.util.Scanner;

public class Section_3_Question_2{ 
  public static void main(String args[]){
    
    int m,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    m=sc.nextInt();    
    System.out.print("Enter the number of column : ");    
    n=sc.nextInt();
    int arr[][]=new int[m][n];
    
    int i,j;    
       
    System.out.println("Enter the  matrix element : ");    
    for(i = 0 ; i < m ; i++){    
        for(j = 0 ; j < n ; j++){    
            arr[i][j]=sc.nextInt();  
        }    
    }     
    
    System.out.print("Elements above secondary diagonal : ");    
    for(i = 0 ; i < m ; i++){    
        for(j = 0 ; j < n ; j++){    
            if(i + j < m - 1)System.out.print(arr[i][j] + "  ");
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
Elements above secondary diagonal : 1  2  4 
*/
```

<!-- question-3 -->
<img src="https://user-images.githubusercontent.com/78687135/236385088-3e8af8d5-ceaa-4875-9300-3c9c51e4a9c0.png" alt="question-2" width="90%">

__Answer :__

```java
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

```

<!-- question-4 -->
<img src="https://user-images.githubusercontent.com/78687135/236385590-73828468-02c0-4614-9c03-74e4795d7041.png" width="90%">

__Answer :__

```java
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

```


<!-- question-5 -->
<img src="https://user-images.githubusercontent.com/78687135/236386220-28c3620d-e6e4-4a92-9ef7-a862de351407.png" width="90%">

__Answer :__

```java
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
/*
Middle row elements:
7 6 5 4 3 
Middle column elements:
3 5 5 5 37 
*/

```
