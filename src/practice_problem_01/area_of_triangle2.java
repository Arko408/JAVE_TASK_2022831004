package practice_problem_01;

import java.util.Scanner;

public class area_of_triangle2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        double ans=s*(s-a)*(s-b)*(s-c);
        ans=Math.sqrt(ans);
        System.out.println(ans);
    }
}
