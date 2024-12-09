 /*
 3-rows
3-columns
3x3=9 elements we have to give
NOTE:to perform transpose matrix we have use square matrix e.g:2x2;3x3;4x4 like this
1
2
3
4
5
6
7
8
9
NORMAL MATRIX
1 2 3
4 5 6
7 8 9
TRANSPOSE MATRIX
1 4 7 
2 5 8
3 6 9
*/
import java.util.*;
public class Transposeofamatrix{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
    }
  }