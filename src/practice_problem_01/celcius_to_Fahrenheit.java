package practice_problem_01;

import java.util.Scanner;

public class celcius_to_Fahrenheit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double c = sc.nextInt();
        double ans=(c*9)/5;
        ans+=32;
        System.out.println(ans);
    }
}
