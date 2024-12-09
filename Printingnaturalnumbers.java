import java.util.*;
public class Printingnaturalnumbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ns[]=new int[n];
        int s=0;
        int k=0;     
        for(int i=1;i<=n;i++)
       {
        s+=1;
        ns[k]=s;
        k++;
       }
       System.out.println(Arrays.toString(ns));
    }
}