package practice_problem_01;

import java.util.Scanner;

public class area_of_equilateraltriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a = sc.nextInt();
        double r=Math.sqrt(3);
        double ans=a*a*r;
        ans/=4;
        System.out.println(ans);
    }
}
