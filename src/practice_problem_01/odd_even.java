package practice_problem_01;

import java.util.Scanner;

public class odd_even
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) System.out.println("even");
        else System.out.println("odd");
    }
}
