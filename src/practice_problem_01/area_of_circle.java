package practice_problem_01;

import java.util.Scanner;

public class area_of_circle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double radius = sc.nextInt();
        double ans=3.1416*radius*radius;
        System.out.println(ans);
    }
}
