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