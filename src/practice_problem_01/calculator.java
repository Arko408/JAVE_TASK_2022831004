package practice_problem_01;

import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().charAt(0);
        if(ch=='+') System.out.println(a+b);
        else if(ch=='-') System.out.println(a-b);
        else if(ch=='*') System.out.println(a*b);
        else if(ch=='/') System.out.println(a/b);
    }
}
