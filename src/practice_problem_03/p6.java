package practice_problem_03;

import java.util.Scanner;

public class p6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        v[0]=0;
        v[1]=1;
        for(int i=2 ; i<n ; i++)
        {
            v[i]=v[i-1]+v[i-2];
        }
        for (int i = 0; i<n ; i++)
        {
            System.out.print(v[i]+" ");
        }
    }
}
