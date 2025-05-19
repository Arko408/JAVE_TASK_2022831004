package practice_problem_03;

import java.util.Scanner;

public class p5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        int even=0;
        for (int i = 0; i < n; i++)
        {
            v[i] = scanner.nextInt();
            if(v[i]%2==0) even++;
        }
        System.out.println("even is "+even);
        System.out.println("odd is "+(n-even));
    }
}
