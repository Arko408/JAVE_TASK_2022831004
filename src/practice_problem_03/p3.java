package practice_problem_03;

import java.util.Scanner;

public class p3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        int ans=0;
        for (int i = 2; i < n; i++)
        {
            if(n%i==0)
            {
                ans=1;
                break;
            }
        }
        if(ans==1) System.out.println("not prime");
        else System.out.println("prime");
    }
}
