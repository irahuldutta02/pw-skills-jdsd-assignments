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

The time complexity of the given code is O(n^2). 

The outer loop iterates n times, and for each iteration of the outer loop, the inner loop iterates i times. So, the total number of iterations of the inner loop is the sum of the first n integers, which is n*(n+1)/2.

Therefore, the overall time complexity of the code is O(n*(n+1)/2), which simplifies to O(n^2).

One way to improve the time complexity of the code is to use the formula for the sum of the first n integers instead of using a nested loop. The sum of the first n integers can be calculated as n*(n+1)/2. So, the code can be rewritten as:

```java
int sum = n*(n+1)/2;
```

This code has a time complexity of O(1), which is a significant improvement over the original code.

**Question 2 :**
-
### Find the value of `T(2)` for the recurrence relation `T(n) = 3T(n-1) + 12n` given that `T(0) = 5`

__Answer :__

To find the value of T(2) for the recurrence relation T(n) = 3T(n-1) + 12n given that T(0) = 5, we need to apply the recurrence relation twice, starting from n = 0.

First, we can find T(1) using the recurrence relation:

T(1) = 3T(0) + 12(1) = 3(5) + 12 = 27

Next, we can find T(2) using the recurrence relation again:

T(2) = 3T(1) + 12(2) = 3(27) + 24 = 105

Therefore, the value of T(2) is 105.

**Question 3 :** 
-
### Given a recurrence relation, solve it using a substitution method. Relation : `T(n) = T(n - 1) + c`

__Answer :__

To solve the recurrence relation T(n) = T(n-1) + c using the substitution method, we need to make a guess for the solution and then prove it by mathematical induction.

Let's assume that T(n) = kn + b, where k and b are constants. We will now substitute this guess into the recurrence relation and see if it holds.

T(n) = T(n-1) + c
kn + b = k(n-1) + b + c
kn + b = kn - k + b + c
k = c

Therefore, we can conclude that k = c. 

Now we can solve for b using the initial condition T(1) = a, where a is some constant.

T(1) = k(1) + b = a
b = a - c

Therefore, the solution to the recurrence relation T(n) = T(n-1) + c is T(n) = cn + a - c.

**Question 4 :**
-
### Given a recurrence relation: `T(n) = 16T(n/4) + n2logn` | Find the time complexity of this relation using the master theorem.

__Answer :__

To find the time complexity of the recurrence relation T(n) = 16T(n/4) + n^2logn using the master theorem, we need to compare the given recurrence relation with the standard form of the master theorem, which is:

T(n) = aT(n/b) + f(n)

where a is the number of subproblems, b is the size of each subproblem, and f(n) is the time complexity of the work done outside the subproblems.

In the given recurrence relation, we have:

a = 16, b = 4, and f(n) = n^2logn

Now we can calculate the value of logb a:

log4 16 = 2

Since f(n) = n^2logn, we can calculate the value of n^logb a:

n^log4 16 = n^2

Now we can compare the two values and determine the time complexity of the recurrence relation using the master theorem:

If f(n) = O(n^k) for some constant k < logb a, then T(n) = Θ(n^logb a).

If f(n) = Θ(n^k logm n) for some constants k and m, where logm n = Ω(1), then T(n) = Θ(n^k logm+1 n).

If f(n) = Ω(n^k) for some constant k > logb a, and if af(n/b) ≤ cf(n) for some constant c < 1 and all sufficiently large n, then T(n) = Θ(f(n)).

In our case, we have k = 2 and logb a = 2. Since k = logb a, we are in case 2 of the master theorem. Therefore, the time complexity of the recurrence relation T(n) = 16T(n/4) + n^2logn is Θ(n^2log^2n).

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

**Q2:**
-
### Write a program to traverse over the elements of the array using for each loop and print all even elements.

    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 34 54
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 4 6

__Answer :__

**Q3:**
- 
### Write a program to calculate the maximum element in the array.

    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 65
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 7

__Answer :__

**Q4:** 
-
### Write a program to find out the second largest element in a given array.

    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 54
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 6

__Answer :__

**Q5:** 
-
### Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor.

    Input 1: arr[] = {1,3,2,6,5}
    Output 1: 6
    Input 2: arr[] = {1 4,7,3,2,6,5}
    Output 1: 7

__Answer :__



## **3. 2D Array**
---
