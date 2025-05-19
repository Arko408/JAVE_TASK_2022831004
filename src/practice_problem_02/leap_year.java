package practice_problem_02;

import java.util.Scanner;

public class leap_year
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c = sc.nextInt();
        if(c<100)
        {
            if(c%4==0) System.out.println("leap year");
            else System.out.println("not leap year");
        }
        else
        {
            if(c%400==0) System.out.println("leap year");
            else System.out.println("not leap year");
        }
    }
}
