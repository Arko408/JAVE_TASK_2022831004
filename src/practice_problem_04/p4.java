package practice_problem_04;

import java.util.Scanner;

public class p4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        boolean f=true;
        for(int i=s.length()-1,j=0 ; i>=0 ; i--,j++)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                f=false;
                break;
            }
        }
        if(f) System.out.print("palindrome");
        else System.out.print("not palindrome");
    }
}
