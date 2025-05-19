package practice_problem_01;

import java.util.Scanner;

public class area_of_triangle
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int base = sc.nextInt();
            int height = sc.nextInt();
            double ans=base*height;
            ans/=2;
            System.out.println(ans);
    }
}


