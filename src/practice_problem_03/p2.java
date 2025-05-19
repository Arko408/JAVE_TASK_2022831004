package practice_problem_03;

import java.util.Scanner;

public class p2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        int ans=0;
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
            if(v[i]>ans) ans=v[i];
        }
        System.out.println(ans);
    }
}
