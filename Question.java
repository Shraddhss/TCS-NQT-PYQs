/*
Question: 2
A parking lot in a park has MxN number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find the row with have maximum number of cars parked in it.

Note :
MxN- Size of the matrix

M is the number of row and N is number of columns
Elements of the matrix M should be only 0 or 1.

Input Format:
1) The first line of input contains the value M the number of rows.
2) The second line of input contains value N represents the number of columns.
3) Next line contains a matrix with values 1 and 0

Output Format:
Print the Row which have maximum number of cars parked in it.

Sample Input1:
R=3
L=4

Matrix= 0   1   0   0

        1   1   0   1

        1   1   1   1

Output : 3 Row 3 have maximum number of 1.


 */



solution:

 import java.util.*; 
 public class Cars { 
  public static void main(String[] args) { 
  Scanner scanner = new Scanner(System.in); 
   
  int m = scanner.nextInt(); // number of rows in the matrix  
  int n = scanner.nextInt(); // number of columns in the matrix   
  int[][] arr = new int[m][n]; 
   
  // Taking input of the array 
  for (int i = 0; i < m; i++) { 
  for (int j = 0; j < n; j++) { 
  arr[i][j] = scanner.nextInt(); 
  } 
  } 
   
  int maxCars = 0; // maximum number of cars 
  int ans = -1; // which row has the maximum number of cars    
  for (int i = 0; i < m; i++) { 
  int cnt = 0; // denotes how many cars are there in the current row   
  for (int j = 0; j < n; j++) { 
  if (arr[i][j] == 1) {
  cnt++; 
  } 
  } 
   
  if (cnt >= maxCars) {  maxCars = cnt;  ans = i + 1; 
  } 
  } 
   
  System.out.println(ans);   
  scanner.close(); 
  } 
 }
 
