/*
3
3
1
2
3
4
5
6
7
8
9
Before Transpose
1 2 3
4 5 6
7 8 9
After Transpose
1 4 7
2 5 8
3 6 9
*/
import java.util.*;
public class Nrmlandtransposematrix {
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
    System.out.println("Before Transpose");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }System.out.println("After Transpose");
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