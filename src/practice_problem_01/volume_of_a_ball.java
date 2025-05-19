package practice_problem_01;

import java.util.Scanner;

public class volume_of_a_ball
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double radius = sc.nextInt();
        double ans=4*3.1416*radius*radius*radius;
        ans/=3;
        System.out.println(ans);
    }
}
