package practice_problem_04;

import java.util.Scanner;

public class p5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char ch = sc.next().charAt(0);
        int cnt=0;
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)==ch)
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
